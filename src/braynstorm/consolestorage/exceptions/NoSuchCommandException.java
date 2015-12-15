package braynstorm.consolestorage.exceptions;

public class NoSuchCommandException extends Exception {
	private static final long serialVersionUID = -6014421079620305486L;
	private String str;
	
	public NoSuchCommandException(String str){
		this.str = str;
	}
	
	public void printFormatted(){
		System.out.println("ERROR: No such command '" + str + "'.");
	}
}
