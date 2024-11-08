package command;

interface FileIO {
	public void execute(Command cmd);
}
interface FileOperation {
	public void openFile();
	public void readFile();
	public void closeFile();
}
class Command {
	String ioName;
	Command(String ioName) {
		this.ioName = ioName;
	}
	public String getIoName(){
		return ioName;
	}
}
class CommandExecutor implements FileIO {
		public void execute(Command cmd) {
		if(cmd.getIoName().equals("Window")) {
		FileOperation fop= new WindowFileOperation();
		fop.openFile();
		fop.readFile();
		fop.closeFile();
		}else if(cmd.getIoName().equals("Unix")) {
		
		FileOperation fop= new UnixFileOperation();
		fop.openFile();
		fop.readFile();
		fop.closeFile();
		}
	}
}
class WindowFileOperation implements FileOperation {
	public void openFile(){
		System.out.println("Window File Operation");
	}
	public void readFile(){
		System.out.println("Window File Reading");
	}
	public void closeFile(){
		System.out.println("Window File close");	
	}
}
class UnixFileOperation implements FileOperation {
	public void openFile(){
	System.out.println("Unix File Operation");
	}
	public void readFile(){
	System.out.println("Unix File Operation");
	}
	public void closeFile(){
	System.out.println("Unix File Operation");
	}
}
class CommandTest {
	public static void main(String args[]) {
	CommandExecutor command = new CommandExecutor();
	command.execute(new Command("Window"));	
	}
}

