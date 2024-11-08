package isp;


/*interface GenernalInterface {
public void log();
public void openConnection();
public void closeConnection();
public void fileOpen();
public void fileClose();
}
class LoggerInfo implements GeneralInterface{
public void log(){
	logger implementation
}
public void openConnection(){}
public void closeConnection(){}
public void fileOpen(){}
public void fileClose(){}
}
class DatabaseInfo implements GeneralInterface {
public void log(){}
public void openConnection(){
	database opening code
}
public void closeConnection(){
	database close code
}
public void fileOpen(){}
public void fileClose(){}
} 
class FileInfo implements GeneralInterface {
public void log(){}
public void openConnection(){}
public void closeConnection(){}
public void fileOpen(){
	file opening code
}
public void fileClose(){
	file closing code
}
}
*/
interface LoggerInterface {
public void log();
}
class LoggerInfo implements LoggerInterface{
public void log(){
	//logger implementation
}

}
interface DatabaseInterface {
public void openConnection();
public void closeConnection();
}
class DatabaseInfo implements DatabaseInterface {
public void openConnection(){
	//database opening code
}
public void closeConnection(){
	//database close code
}
}
interface FileOperationInterface {
public void fileOpen();
public void fileClose();
}
class FileInfo implements FileOperationInterface {
public void fileOpen(){
	//file opening code
}
public void fileClose(){
	//file closing code
}
}

public class InterfaceSegregationPrinciple {
	public static void main(String[] args) {
		
	}
}
