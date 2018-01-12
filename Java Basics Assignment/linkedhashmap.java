
package com.accolite.au;
import java.util.*;

public class linkedhashmap {
	
	LinkedList<Node> l1;
   linkedhashmap()
   {
	l1=new LinkedList<Node>();
	}

   public void put(int key,int value)
   {    
   int y=0;
      Node q;
	   Iterator<Node> x = l1.iterator();
	   while (x.hasNext()) {
	   
	   q=x.next();
	   
	   if(q.getkey()==key)
	   {   y=1;
           q.value=value;    		   
	        break;
	        }
	   }
	   if(y==0)
	   {
		   Node t=new Node(key,value);
		   l1.add(t);
	   }
    }
   
   public void remove(int key)
   {
	   for(Iterator<Node> iter = l1.iterator(); iter.hasNext();) {
		    Node data = iter.next();
		    if (data.getkey() == key) {
		        iter.remove();
		    }
		}
   }
   
   public int get(int key)
   {
	   Iterator<Node> iter = l1.iterator();
	   Node data = iter.next();
	    if (data.getkey() == key) {
	         return data.getvalue();
	    }
	    return -1;
   }
   public void print_all()
   {
	   for(Iterator<Node> iter = l1.iterator(); ;) {
		   
			   {Node data = iter.next();
		    System.out.println("key is "+data.getkey());
		    System.out.println("value is "+(data.getvalue()));
		    if(!iter.hasNext())
		    {break;
			   }
			   }
	   }}
   
}