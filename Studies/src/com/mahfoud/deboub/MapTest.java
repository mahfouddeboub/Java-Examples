package com.mahfoud.deboub;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new Doggy("aiko")); // add some key/value pairs
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");
		Doggy d1 = new Doggy("clover");
		m.put(d1, "Dog key");
		m.put(new Catty(), "Cat key");
		System.out.println(m.get("k1")); // #1
		String k2 = "k2";
		System.out.println(m.get(k2)); // #2
		Pets p = Pets.CAT;
		System.out.println(m.get(p)); // #3
		System.out.println(m.get(d1)); // #4
		System.out.println(m.get(new Catty())); // #5
		System.out.println(m.size());
		

	}

}

class Doggy{
	public String name;
	Doggy(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean equals(Object o){
		if((o instanceof Doggy) && (this.getName() == ((Doggy)o).name))
				return true;
	    return false;
	}
	public int hashCode(){
		return this.getName().length();
	}
	
}
class Catty{}
enum Pets{ DOG, CAT, HORSE}
