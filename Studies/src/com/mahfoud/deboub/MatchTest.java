package com.mahfoud.deboub;
import java.util.regex.*;
public class MatchTest {
	
	private static String s = ".*?xx";
	private static String x = "ab34ed";

	public static void main(String[] args) {
		Pattern p = Pattern.compile("aa*?");
		//Pattern p = Pattern.compile("(\\d)*");
		//Pattern p = Pattern.compile("a+?");
		//Matcher m  = p.matcher("aba");
		//Matcher m  = p.matcher("123 sds sadwvf 221");
		Matcher m = p.matcher("banaana");
		while( m.find()){
			System.out.println(m.start() +  " :  " +m.group());	
		}
		int a =-123;
		int aa = 12345;
		System.out.printf(">%1$(7d< \n", a);
		System.out.printf(">%0,7d< \n", aa);
		System.out.printf(">%-5d< \n", aa);
		System.out.printf(">%2$b + %1$(5d< \n", a, false);
	}
	
	


}
