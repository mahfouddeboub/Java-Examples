package com.mahfoud.deboub;

import java.util.*;

public class ScannerTest {
	private static String source = "M 78 P 85 C 92 E 66 B 88";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(source);
		while(sc.hasNext()){
			if(sc.hasNextInt()){
				System.out.println("int:"+ sc.next());
				}
			else{
				System.out.println("no next int");
				sc.next();
			}
		
		}
	
		}

}
