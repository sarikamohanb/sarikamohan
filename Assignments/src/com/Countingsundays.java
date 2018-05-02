package com;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Countingsundays {

	public static void main(String[] args) {
		int x = 1901, y = 2000;
		int sunday = noOfSundays(x, y);
		System.out.println("No of sundays:"+sunday);

	}
   private static int noOfSundays(int x, int y) {
	   int sunday=0;
	   for(int i=x;i<=y;i++){
		for(int j=1;j<=12;j++){   
	   String date="1/"+j+"/"+i;
	   SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
	   Date dt1=null;
	try {
		dt1 = format1.parse(date);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   DateFormat format2=new SimpleDateFormat("EEEE"); 
	   String finalDay=format2.format(dt1);
	  if(finalDay.equalsIgnoreCase("Sunday")){
		  sunday++;
	  }
        	
		}
		}
	   
		return sunday;
	}
	   
   }

	


