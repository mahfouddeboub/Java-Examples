package com.mahfoud.deboub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Sub {
	
	private String name;
	private int age;
	
	public Sub(String name, int age){
		this.age = age;
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		return this.getAge();
		
	}

	@Override
	public boolean equals(Object obj) {
		return ((getClass() == obj.getClass()) && (((Sub) obj).age == this.getAge()) && (((Sub) obj).getName() == this.getName()));
		
	}

	public static void main(String[] args) {
		Sub sub1 = new Sub("dave", 25);
		Sub sub2 = new Sub("dave", 25);
		System.out.println(sub1.equals(sub2) + " " + (sub1 == sub2));
		System.out.println(sub1.toString());
		System.out.println(sub2.toString());
		
		String a = "dave";
		String b = "dave";
		System.out.println((a == b) + " " +(a.equals(b)) );
		System.out.println(a.toString() + " " + b.toString());
		
		Queue<String> myQueue = new LinkedList<String>();
		myQueue.offer("a");
		myQueue.offer("b");
		myQueue.offer("c");
		while(myQueue.peek() != null){
			//System.out.println(myQueue.poll());
			System.out.println(myQueue.size());
			System.out.println(myQueue.poll());
		}
		
		
		Map<String, List<Integer>> testScores = new HashMap<String, List<Integer>>();
		
		List<Integer> daveScores = new ArrayList<Integer>();
		daveScores.add(40);
		daveScores.add(60);
		daveScores.add(80);
		
		List<Integer> steveScores = new ArrayList<Integer>();
		steveScores.add(50);
		steveScores.add(50);
		steveScores.add(50);
		
		List<Integer> joeScores = new ArrayList<Integer>();
		joeScores.add(20);
		joeScores.add(30);
		joeScores.add(70);
		joeScores.add(20);
		
		
		testScores.put("dave", daveScores);
		testScores.put("steve", steveScores);
		testScores.put("joe", joeScores);
		printScores("dave", testScores);
		printScores("steve", testScores);
		printScores("joe", testScores);
		
		
		


	}
	
	static public void printScores(String name, Map<String, List<Integer>> scoresName){
		List<Integer> scoresList = scoresName.get(name);
		for(int scores : scoresList){
			System.out.print(scores + " ");
		}
		System.out.println();
		
	}

}

