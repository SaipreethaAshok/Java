package File_Handle;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;                   

public class WriteEx {

	public static void main(String[] args) {
		try {
			Writer write=new FileWriter("file1.txt");
			String str="My name is Preetha";
			write.write(str);
			write.close();
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
}

}
