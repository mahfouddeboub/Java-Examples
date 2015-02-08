package com.mahfoud.deboub;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

public class TestDates {

	public static void main(String[] args) {
		Date d = new Date();
		
		//d.setTime(d.getTime()+3600000);
		//System.out.println(d.toString());
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		//cal.add(Calendar.MONTH, 13);
		//System.out.println("After 3 months : "+ cal.getTime());
		cal.roll(Calendar.MONTH, 3);
		System.out.println(cal.getTime());
		
		DateFormat df1  =DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
		System.out.println(df1.format(d));
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
		System.out.println(df2.format(d));
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
		System.out.println(df3.format(d));
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.UK);
		System.out.println(df4.format(d));
		DateFormat df5  =DateFormat.getTimeInstance(DateFormat.SHORT, Locale.UK);
		System.out.println(df5.format(d));
		DateFormat df6 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.UK);
		System.out.println(df6.format(d));
		DateFormat df7 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT, Locale.UK);
		System.out.println(df7.format(d));
		DateFormat df8 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.UK);
		System.out.println(df8.format(d));
		DateFormat df9 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, Locale.UK);
		System.out.println(df9.format(d));
		
		System.out.println("                   ");

		System.out.println("              *******************");
		System.out.println("              *******************");
		System.out.println("              *******************");
		System.out.println("                       ");

		

		float f = 123.45678f;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(f));
		
		try{
			NumberFormat nf1 = NumberFormat.getInstance();
		    nf1.setParseIntegerOnly(true);
		    System.out.println(nf1.parse("1.23"));
		    }catch(ParseException e){
		    	System.out.println(e.toString());
		    }
		
		NumberFormat nf2 = NumberFormat.getInstance(Locale.UK);
		NumberFormat nf3 = NumberFormat.getInstance(Locale.ITALY);
		long million = 1000000;
		System.out.println(nf2.format(million));
		System.out.println(nf3.format(million));
		
		int money = 100;
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(nf4.format(money));
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf5.format(money));
		
		System.out.println(Locale.UK.getDisplayCountry()+ "--- "+Locale.UK.getDisplayLanguage());
		System.out.println(Locale.UK.getDisplayCountry(Locale.FRANCE)+ "--- "+Locale.UK.getDisplayLanguage(Locale.FRANCE));
		
		Date date1 = new Date(1111111111);
		Date date   = new Date();
		System.out.println(date1);
		System.out.println(date);
		long msec = date.getTime();
		System.out.println("Millisecond since Jan. 1, 1970 GMT = "+msec);
		Date date2;
		DateFormat fmt = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
		try{
			date2 = fmt.parse("Saturday, July 4, 1998 ");
			System.out.println("The date string is: "+fmt.format(date2));
		}catch(java.text.ParseException e){
			System.out.println(e);
			
		}

     }

}
