@echo off
echo Stopping Selenium Grid...
docker stop selenium-hub selenium-node-chrome selenium-node-firefox
docker rm selenium-hub selenium-node-chrome selenium-node-firefox
echo Selenium Grid stopped and removed!
pause