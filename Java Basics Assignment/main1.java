package com.accolite.au;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       linkedhashmap x=new linkedhashmap();
       x.put(5,10);
       x.put(2,20);
       x.put(1,30);
       x.put(4,0);
       
       x.remove(1);
       int q=x.get(5);
       System.out.println("value from get"+q);
       System.out.println("printing all");
       x.print_all();
       
	}

}
