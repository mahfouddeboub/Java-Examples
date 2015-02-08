package com.mahfoud.deboub;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerTest {


	public static void main(String[] args) {
		
		SerClass ser1 = new SerClass(1, new Thing("thing1"));
		SerClass ser2 = new SerClass(2, new Thing("thing2"));
		
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("tesfile.ser"));
			os.writeObject(ser1);
			os.writeObject(ser2);
			os.close();
			System.out.println("********** Object ser1 & sre2 serialized************");
			
		}catch(IOException e){
			e.printStackTrace();
		}try{
			
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("tesfile.ser"));
			SerClass ser11 = (SerClass) is.readObject();
			SerClass ser22 = (SerClass) is.readObject();
			
			
			System.out.println("********** Object ser1 & ser2 Deserialzed***********");

			System.out.println("ser1 id : " +ser11.getId());
			System.out.println("ser2 id : " +ser22.getId());
			System.out.println("ser1 thing : " + ser11.getT().getName());
			System.out.println("ser2 thing : " + ser22.getT().getName());
			is.close();

		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		

	}

}

class SerClass implements Serializable{
	private int id;
	private transient Thing t;
	
	SerClass(int id, Thing t){
		this.id = id;
		this.t = t;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	public Thing getT(){
		return t;
	}
	private void writeObject(ObjectOutputStream os){
		try{
			os.defaultWriteObject();
			os.writeUTF(t.getName());
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	private void readObject(ObjectInputStream is){
		try{
			is.defaultReadObject();
		    t = new Thing(is.readUTF());
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
}
}

class Thing{
	
	private String name;
	
	Thing(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
}

