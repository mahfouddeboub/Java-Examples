package com.mahfoud.deboub;

import java.io.*;

public class SerialiseCut {
	

	public static void main(String[] args) {
	
		Cat c = new Cat();
		try{
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c);
			os.close();
			c.z =20;
		}catch(Exception e){
			e.printStackTrace();	
		}
		try{
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois  = new ObjectInputStream(fis);
			c = (Cat) ois.readObject();
			
			ois.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("the integer in Cat is: "+c.i + " Integer x is: "+ c.getX() + " and Z is : "+ c.z + " and S is : "+ c.s);
		

	}

}
 class Cat implements Serializable{
	 
	 private transient int x = 1;
	 static int z = 10;
	 volatile int  s = 67;
	public static void setZ(int z) {
		Cat.z = z;
	}
	int i = 10;
	  public int getX(){
		  return x;
	  }
	  private void writeObject(ObjectOutputStream os)throws IOException{
		  
			  os.defaultWriteObject();
			  os.writeInt(getX());  
	  }
	  private void readObject(ObjectInputStream is)throws IOException, ClassNotFoundException{
		  is.defaultReadObject();
		  this.x =  is.readInt();
	  }
 }