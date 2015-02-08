package com.mahfoud.deboub;

import java.util.*;

public class TestGenerics {

	public static void main(String[] args) {
		Horse [] horses = {new Horse(), new Horse()};
		Cut [] cuts = {new Cut(), new Cut()};
		AnimalDoctor d = new AnimalDoctor();
		d.checkAnimal(horses);
		System.out.println("***********************");
		d.checkAnimal(cuts);
		System.out.println("***********************");
		List<Horse> animalsList = new ArrayList<Horse>();
		animalsList.add(new Horse());
		animalsList.add(new Horse());
		List<Cut> cutsList = new ArrayList<Cut>();
		cutsList.add(new Cut());
		cutsList.add(new Cut());
		AnimalDoctor d2 = new AnimalDoctor();
		System.out.println("***********************");
		d2.checkAnimalsList1(animalsList);
		System.out.println("***********************");
		d2.checkAnimalsList2(cutsList);
		System.out.println("***********************");
		
		Set<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(2);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
		

	}

}

abstract class Animal{
	abstract void check();
}

class Horse extends Animal{

	@Override
	void check() {
		System.out.println("animal is a horse!!!");		
	}	
}

class Cut extends Animal{

	@Override
	void check() {
		System.out.println("animal is a cut!!!");		
	}	
}

class AnimalDoctor{
	public void checkAnimal(Animal [] animals){
		for(Animal animal : animals )
			animal.check();	
	}
	public void checkAnimalsList1(List<? super Horse> animals){
		for(Object animal : animals )
			((Horse) animal).check();	
	}
	public void checkAnimalsList2(List<? super Cut> animals){
		for(Object animal : animals )
			((Cut) animal).check();	
	}
}