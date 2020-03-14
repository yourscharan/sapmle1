echo "HRM automation suite exceution"
cd D:\nagneon\hrm
 
mvn clean test -DsuiteXmlFile=testng.xml
pause
