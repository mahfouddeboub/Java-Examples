package com.mahfoud.deboub;

import java.io.*;
import java.util.*;


public class DvdPlayer {
	
	List<DvdInfo> dvdList = new ArrayList<DvdInfo>();
	
	public static void main(String[] args) {
		new DvdPlayer().go();

	}


    public void go(){
	    populateList();
	    System.out.println(dvdList);
	    System.out.println("**********************");
	    Collections.sort(dvdList);
	    System.out.println(dvdList);
	    System.out.println("**********************");
		GenreSort gs = new GenreSort();
		Collections.sort(dvdList, gs);
	    System.out.println(dvdList);
   }
    
   public void populateList(){
   	    try{
		    File dvdFile = new File("dvd.txt");
		    dvdFile.createNewFile();
		    FileReader fr = new FileReader(dvdFile);
		    BufferedReader br = new BufferedReader(fr);
		    DvdInfo dvd;
		    String s;
		    while((s = br.readLine()) != null){
			     String [] ss = s.split("/");
		         dvd = new DvdInfo(ss[0], ss[1], ss[2]);
		         dvdList.add(dvd);	
		   }
	    }catch(FileNotFoundException e){
		   e.printStackTrace();
		
	    }catch (IOException e) {
		   e.printStackTrace();
	}
}
}

class DvdInfo implements Comparable<DvdInfo>{
	
	String title;
	String genre;
	String leadActor;

	@Override
	public String toString() {
		return  title + " : " + genre + " : " + leadActor + "\n";
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public DvdInfo(String title, String genre, String leadActor) {
		super();
		this.genre = genre;
		this.title = title;
		this.leadActor = leadActor;
	}

	@Override
	public int compareTo(DvdInfo d) {
		return title.compareTo(d.getTitle());
	}
}

class GenreSort implements Comparator<DvdInfo>{

	@Override
	public int compare(DvdInfo one, DvdInfo two) {
		return one.genre.compareTo(two.genre);
		
	}
	
}
