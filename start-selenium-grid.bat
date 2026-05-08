@echo off
echo ========================================
echo Starting Selenium Grid (Manual Setup)
echo ========================================
echo.

echo Stopping existing containers...
docker stop selenium-hub selenium-node-chrome selenium-node-firefox 2>nul
docker rm selenium-hub selenium-node-chrome selenium-node-firefox 2>nul

echo.
echo Starting Selenium Hub...
docker run -d --name selenium-hub -p 4442-4444:4442-4444 selenium/hub:latest

echo Waiting 5 seconds for hub to start...
timeout /t 5 /nobreak >nul

echo.
echo Starting Chrome Node (2GB shared memory)...
docker run -d --shm-size="2g" --name selenium-node-chrome --link selenium-hub:hub -e SE_EVENT_BUS_HOST=selenium-hub -e SE_EVENT_BUS_PUBLISH_PORT=4442 -e SE_EVENT_BUS_SUBSCRIBE_PORT=4443 -e SE_NODE_MAX_SESSIONS=2 -e SE_NODE_SESSION_TIMEOUT=300 -e SE_VNC_NO_PASSWORD=1 -e SE_SCREEN_WIDTH=1920 -e SE_SCREEN_HEIGHT=1080 -p 7900:7900 selenium/node-chrome:latest

echo.
echo Starting Firefox Node (2GB shared memory)...
docker run -d --shm-size="2g" --name selenium-node-firefox --link selenium-hub:hub -e SE_EVENT_BUS_HOST=selenium-hub -e SE_EVENT_BUS_PUBLISH_PORT=4442 -e SE_EVENT_BUS_SUBSCRIBE_PORT=4443 -e SE_NODE_MAX_SESSIONS=2 -e SE_NODE_SESSION_TIMEOUT=300 -e SE_VNC_NO_PASSWORD=1 -p 7901:7900 selenium/node-firefox:latest

echo.
echo Waiting for nodes to register...
timeout /t 5 /nobreak >nul

echo.
echo ========================================
echo Verifying Setup...
echo ========================================

echo.
echo Chrome Shared Memory:
docker exec selenium-node-chrome df -h /dev/shm

echo.
echo Firefox Shared Memory:
docker exec selenium-node-firefox df -h /dev/shm

echo.
echo Chrome Connection Status:
docker logs selenium-node-chrome 2>&1 | findstr /C:"added" /C:"Started"

echo.
echo Firefox Connection Status:
docker logs selenium-node-firefox 2>&1 | findstr /C:"added" /C:"Started"

echo.
echo ========================================
echo Selenium Grid Ready!
echo ========================================
echo Grid Console: http://localhost:4444/ui
echo VNC Chrome:   localhost:7900 (password: secret)
echo VNC Firefox:  localhost:7901 (password: secret)
echo ========================================
pause