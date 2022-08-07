package File_Handle;

import java.io.*;
import java.io.FileReader;

public class ReaderEx {

	public static void main(String[] args) {
		try {
			Reader reader=new FileReader("file.txt");
			int data=reader.read();
			while(data!=-1)
			{
				System.out.println((char) data);
				data=reader.read();
			}
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
	}
}
