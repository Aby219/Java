package javalab;
import java.io.*;
 public class Copyfile {
	 
	public static void main(String args[]) {
		try {
		FileInputStream fin = new FileInputStream("abin.txt");
		FileOutputStream fout = new FileOutputStream("abin2.txt");
		int i;
		while((i=fin.read())!=-1)
		{
			fout.write(i);
			
		}
		System.out.println("sucessfully wrote to specific file");
		fin.close();
		fout.close();
		
	}
	catch (java.io.FileNotFoundException e) {
		System.out.println("file not found:" +e.getMessage());
	}
	catch (IOException e) {
		System.out.println(e.getMessage());
		
	}}}


