package com.mahfoud.deboub;

import java.util.*;

public class Ferry {

	public static void main(String[] args) {
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205);
		times.add(1305);
		times.add(1345);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		times.add(1600);
		times.add(2000);
		System.out.println(times.size());
	    //System.out.println(times.last()+" : " + times.first()+ " : " + times.pollFirst()+ " : " + times.pollLast());
		//System.out.println(times.size());
		System.out.println(times.lower(1600));
		System.out.println(times.higher(2000));
		System.out.println(times.floor(1600));
		System.out.println(times.ceiling(2000));
		TreeSet<Integer> subSet = new TreeSet<Integer>();
		subSet = (TreeSet) times.headSet(1600);
		System.out.println(subSet.size()+ " : " + subSet.last()+ " : " + subSet.first());
		TreeSet<Integer> subSet2 = new TreeSet<Integer>();
		subSet2 = (TreeSet) times.tailSet(2000);
		System.out.println(subSet2.size()+ " : "+ subSet2.last()+ " : "+ subSet2.first());

	}

}
