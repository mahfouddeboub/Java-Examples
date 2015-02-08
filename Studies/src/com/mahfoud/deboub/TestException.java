package com.mahfoud.deboub;

public class TestException {

	public static void main(String[] args) {
		try{
			throw new Exception();
		}catch(	Exception e){
			System.out.println("first");
			try{
				throw new Exception();
				//System.out.println("hhhh");
				
			}catch(Exception ee){
				System.out.println("Second");
			}
			System.out.println("Bey");
		}
		System.out.println("Hello");

	}

}
