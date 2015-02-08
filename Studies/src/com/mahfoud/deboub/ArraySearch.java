package com.mahfoud.deboub;

import java.util.*;

public class ArraySearch {
	
	static String[] sa = {"one", "two", "three", "four"};

	public static void main(String[] args) {
		
		List list = Arrays.asList(sa);
		System.out.println("Size is : " + list.size());
		System.out.println("Elemnt at indext 2 is : " + list.get(2));
		System.out.println("***********************");
		
		List<Integer> ll = new ArrayList<Integer>();
		for(int i = 0; i<3; i++){
			ll.add(i);
		}
		Object [] o = ll.toArray();
		Integer [] ii = new Integer[3];
		ii = ll.toArray(ii);

		Arrays.sort(sa);
		for (String s : sa){
			System.out.println(s);
		}
		System.out.println("one is : " + Arrays.binarySearch(sa, "one"));
		System.out.println("************Now reverse************8");
		ReSortComparator rc = new ReSortComparator();
		Arrays.sort(sa, rc);
		for(String s : sa){
			System.out.println(s);
		}
		System.out.println("one is : " + Arrays.binarySearch(sa, "one"));
		System.out.println("one is : " + Arrays.binarySearch(sa, "one", rc));
		
		
	}

    static class ReSortComparator implements Comparator<String>{

	    @Override
	    public int compare(String a, String b) {
	    	return b.compareTo(a);
	    }
    }
}