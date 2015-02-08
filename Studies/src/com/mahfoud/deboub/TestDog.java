package com.mahfoud.deboub;

import java.util.*;

public class TestDog {

	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<Dog>();
		Dog dog = new Dog("Aiko");
		dogList.add(dog);
		dogList.add(new Dog("Boby"));
		dogList.add(new Dog("Brown"));
		Iterator<Dog> it = dogList.iterator();
		while(it.hasNext()){
			Dog d = it.next();
			System.out.println("The Dog name is: " + d.name);
		}
		System.out.println("the List size is : " + dogList.size());
		System.out.println(dogList.get(1).name);
		System.out.println(dogList.indexOf(dog));
		dogList.remove(2);
		Object [] oa = dogList.toArray();
		for(Object o : oa){
			Dog d2 = (Dog)o;
			System.out.println("Dog name is : " + d2.name);
		}
		

	}

}

class Dog{
	String name;
	Dog(String name){
		this.name = name;
	}
}
