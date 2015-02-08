package com.mahfoud.deboub;

import java.io.*;

public class Writer2 {


	public static void main(String[] args) {
		char [] n = new char[50];
		int size = 0;
		try{
			File file = new File("fileWriter2.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("howdy\nfolks\n");
			fw.flush();
			fw.close();
			FileReader fr = new FileReader(file);
			size = fr.read(n);
			System.out.print(size + " ");
			for(char c : n)
				System.out.print(c);
			
			fr.close();
		    }catch(Exception e){

			
		}

	}

}
