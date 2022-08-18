package ch15.unclassified.S2_바이트기반_스트림;

import java.io.*;

class FileViewer {
	public static void main(String args[]) throws IOException{
		FileInputStream fis = new FileInputStream(args[0]);
		int data = 0;

		while((data=fis.read())!=-1) {
			char c = (char)data;
			System.out.print(c);
		}
	} 
}
