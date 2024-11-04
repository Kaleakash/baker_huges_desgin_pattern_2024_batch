package template;

abstract class DataParser {
	 public void parseDataAndGenerateOutput()  
	    {  
	        readData();  
	        processData();  
	        writeData();  
	    }  
	    //This methods will be implemented by its subclass  
	    abstract void readData();  
	    abstract void processData();  
	      
	    //We have to write output in a CSV file so this step will be same for all subclasses  
	    public void writeData()  
	    {  
	        System.out.println("Output generated,writing to CSV");  
	    }  

}
class CSVDataParser extends DataParser {

	@Override
	void readData() {
		// TODO Auto-generated method stub
		 System.out.println("Reading data from csv file");  
	}

	@Override
	void processData() {
		// TODO Auto-generated method stub
		 System.out.println("Looping through loaded csv file");      
	}

}
class DatabaseDataParser extends DataParser {

	@Override
	void readData() {
		// TODO Auto-generated method stub
		System.out.println("Reading data from database");  
	}

	@Override
	void processData() {
		// TODO Auto-generated method stub
		System.out.println("Looping through datasets");    
	}

}

class TemplateTest {	
	public static void main(String args[]) {
	 CSVDataParser csvDataParser=new CSVDataParser();  
	        csvDataParser.parseDataAndGenerateOutput();  
	        System.out.println("**********************");  
	        DatabaseDataParser databaseDataParser=new DatabaseDataParser();  
	        databaseDataParser.parseDataAndGenerateOutput();  
	
	}

}
