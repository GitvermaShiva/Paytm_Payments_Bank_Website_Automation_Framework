@echo off
echo ========================================
echo SELENIUM GRID STATUS
echo ========================================
echo.

echo Running Containers:
docker ps --filter name=selenium

echo.
echo Chrome Shared Memory:
docker exec selenium-node-chrome df -h /dev/shm 2>nul || echo Chrome container not running

echo.
echo Firefox Shared Memory:
docker exec selenium-node-firefox df -h /dev/shm 2>nul || echo Firefox container not running

echo.
echo Chrome Node Logs:
docker logs selenium-node-chrome --tail 5 2>nul || echo Chrome container not running

echo.
echo Firefox Node Logs:
docker logs selenium-node-firefox --tail 5 2>nul || echo Firefox container not running

echo.
echo ========================================
echo Grid Console: http://localhost:4444/ui
echo ========================================
pause