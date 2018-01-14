package advjava;

import java.time.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.TimeZone;

public class Datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TimeZone z;
		Calendar c;
		z=TimeZone.getTimeZone("Europe/Copenhagen");
		
		c=Calendar.getInstance(z);
		c=java.util.Calendar.getInstance(z);
		System.out.println(z.getID()+" "+c.get(java.util.Calendar.HOUR_OF_DAY)+":"+c.get(java.util.Calendar.MINUTE)+":"+c.get(java.util.Calendar.SECOND));
	
		z=TimeZone.getTimeZone("America/Montreal");
		c=Calendar.getInstance(z);
		c=java.util.Calendar.getInstance(z);
		System.out.println(z.getID()+" "+c.get(java.util.Calendar.HOUR_OF_DAY)+":"+c.get(java.util.Calendar.MINUTE)+":"+c.get(java.util.Calendar.SECOND));
	
		z=TimeZone.getTimeZone("Jamaica");
		c=Calendar.getInstance(z);
		c=java.util.Calendar.getInstance(z);
		System.out.println(z.getID()+" "+c.get(java.util.Calendar.HOUR_OF_DAY)+":"+c.get(java.util.Calendar.MINUTE)+":"+c.get(java.util.Calendar.SECOND));
	
		z=TimeZone.getTimeZone("Cuba");
		c=Calendar.getInstance(z);
		c=java.util.Calendar.getInstance(z);
		System.out.println(z.getID()+" "+c.get(java.util.Calendar.HOUR_OF_DAY)+":"+c.get(java.util.Calendar.MINUTE)+":"+c.get(java.util.Calendar.SECOND));
	
		z=TimeZone.getTimeZone("America/Antigua");
		c=Calendar.getInstance(z);
		c=java.util.Calendar.getInstance(z);
		System.out.println(z.getID()+" "+c.get(java.util.Calendar.HOUR_OF_DAY)+":"+c.get(java.util.Calendar.MINUTE)+":"+c.get(java.util.Calendar.SECOND));
	
		
		ArrayList<Date> al=new ArrayList<Date>();	
		 al.add(new Date(1995,1,1));
         al.add(new Date(1999,1,1));
         al.add(new Date(1997,2,1));
         al.add(new Date(1998,1,1));
         al.add(new Date(1999,1,2));
         
         Collections.sort(al);
         for(int i = 0; i < al.size(); i++) {   
        	   System.out.println(al.get(i).getYear()+" "+al.get(i).getMonth()+" "+al.get(i).getDate()+" ");
        	}  
	}

}
