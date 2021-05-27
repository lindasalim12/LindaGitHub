package test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileOutputStream fileOutputStream;
try {
	fileOutputStream= new FileOutputStream("abc.text");
	String msg= "Welcome to Java!";
			byte byteArray[]=msg.getBytes();//converting string into byte arrays
	fileOutputStream.write(byteArray);
	System.out.println("Message written to file successfully");
}catch(FileNotFoundException e) {
	e.printStackTrace();
}catch(IOException e) {
	e.printStackTrace();
}
	}

}
