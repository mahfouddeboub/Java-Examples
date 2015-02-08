package com.mahfoud.deboub;

 class AAA {

	 AAA() {
		 print();
	}
	  void print(){
		 System.out.print("A");
	 }

}
public class BBB extends AAA{
	int i = 10;
	public static void main(String[] args){
		BBB a = new BBB();
		a.print();
	}
	void print() {
		System.out.println(i);
	}
}