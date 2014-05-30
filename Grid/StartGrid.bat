start java -jar selenium-server-standalone-2.41.0.jar -role hub
start java -jar selenium-server-standalone-2.41.0.jar -role node -Dwebdriver.chrome.driver=h:\grid\chromedriver.exe -Dwebdriver.ie.driver=h:\grid\IEDriverServer.exe -hub http://localhost:4444/grid/register -nodeConfig defaultNodeConfig.json

