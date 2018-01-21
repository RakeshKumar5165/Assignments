package com.au.threading;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducersConsumers {
	private static final Logger LOGGER=Logger.getLogger(ProConMain.class.getName());
	 LinkedList<Integer> list = new LinkedList<>();
     int capacity = 5;

     int z=0;
     public void produce() throws InterruptedException
     {
         int value = 0;
         while (z==0)
         {
             synchronized (this)
             {
                 
                 
                 while (list.size()==capacity)
                     wait();
                 LOGGER.log(Level.INFO,"OUTPUT3","Producer produced-"
                                               + value);

        
                 list.add(value++);
                 notifyAll();
                 this.wait(1000);
             }
         }
     }

     // Function called by consumer thread
     public void consume() throws InterruptedException
     {
         while (z==0)
         {
             synchronized (this)
             {
                 
              
                 while (list.isEmpty()) 
                     wait();

    
                 int val = list.removeFirst();

                 LOGGER.log(Level.INFO,"OUTPUT2","Consumer consumed-"
                                                 + val);

                 
                 notifyAll();

                 
                 this.wait(1000);
             }
         }
     }
 }


