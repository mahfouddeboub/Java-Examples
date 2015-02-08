package com.mahfoud.deboub;

import java.util.*;

public class MapTest2 {

	public static void main(String[] args) {
		
		Map<ToDos, String> map = new HashMap<ToDos, String>();
		ToDos t1 = new ToDos("Monday");
		ToDos t2 = new ToDos("Tuesday");
		ToDos t3 = new ToDos("Monday");
		map.put(t1, "Cleaning");
		map.put(t2, "Waching");
		map.put(t3, "Relaxing");
		System.out.println(map.size());
		
		System.out.println("        *************************           ");
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("5");
		pq.add("8");
		System.out.println(pq.peek()+ " ");
		for(String i : pq)System.out.print(i);
		System.out.println("    ");
		pq.offer("1");
		for(String i : pq)System.out.print(i);
		System.out.println("    ");
		pq.add("3");
		for(String i : pq)System.out.print(i);
		System.out.println("    ");
		pq.remove("1");
		for(String i : pq)System.out.print(i);
		System.out.println("    ");
		System.out.println(pq.poll()+ "  ");
		System.out.println("    ");
		for(String i : pq)System.out.print(i);
		
		if(pq.remove("2"))System.out.println(pq.poll()+ " ");
		System.out.println(pq.poll()+ " "+ pq.peek());
		for(String i : pq)System.out.print(i);
		

	}

}

class ToDos{
	String day;
	ToDos(String day){
		this.day = day;
	}
	public boolean equals(Object o){
		return ((ToDos)o).day == this.day;
	}
	public int hashCode(){
		return 9;
	}
}
