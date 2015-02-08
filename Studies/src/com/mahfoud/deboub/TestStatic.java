package com.mahfoud.deboub;

public class TestStatic {
	

	public static void main(String[] args) {
		System.out.println(Child.ID);
		System.out.println(Child.i);
		Parent p = new Parent();
		Child c = new Child();
		
		//p = c;
		//c = (Child) p;
		
		System.out.println(p.myMethod(" Parent"));
		System.out.println(c.myMethod(" Child"));
		
		

	}

}
class Parent{
	static String ID = " ME";
	static int i = 10;
	
	String myMethod(String x){
		return x;
	}
}
 class Child extends Parent{
	static{System.out.println("Hello:Child ");}
	 String myMethod(String x){
		 return x+"!!!!!!!!!!!!";
	 }
}