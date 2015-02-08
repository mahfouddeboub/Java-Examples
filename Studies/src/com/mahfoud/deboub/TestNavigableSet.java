package com.mahfoud.deboub;

import java.util.*;

public class TestNavigableSet {

	public static void main(String[] args) {
		NavigableSet<String> mySet = new TreeSet<String>(); 
		mySet.add("a");mySet.add("b");mySet.add("c");
		mySet.add("aa");mySet.add("bb");mySet.add("cc");
		System.out.println(mySet.size());
		System.out.println(mySet);
		System.out.println(mySet.size());
		System.out.println(mySet.higher("a"));
		System.out.println(mySet.ceiling("a"));
		System.out.println(mySet.floor("cc"));
		System.out.println(mySet.lower("cc"));
		

		

	}

}
