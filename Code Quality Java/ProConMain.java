package com.au.threading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProConMain
{private static final Logger LOGGER=Logger.getLogger(ProConMain.class.getName());
 public static void main(String[] args)
                     throws InterruptedException
 {
     // Object of a class that has both produce()
     // and consume() methods
      ProducersConsumers a = new ProducersConsumers();

     // Create producer thread
      
      
     Thread t1 = new Thread(()->
     {
             try
             {
                 a.produce();
             }
             catch(InterruptedException e)
             {
            	 LOGGER.log(Level.WARNING, "Interrupted!", e);
            	    // Restore interrupted state...
            	    Thread.currentThread().interrupt();
             }
         
     });

     Thread[] t = new Thread[10];
     // Create consumer thread1
     for(int i=0;i<10;i++){
     Thread t2 = new Thread(()->
     {
           try
             {
                 a.consume();
             }
             catch(InterruptedException e)
             {
            	 LOGGER.log(Level.WARNING, "Interrupted!", e);
         	    // Restore interrupted state...
         	    Thread.currentThread().interrupt();
          
             }
         
     });
     t[i] = t2;
     }
     // Start both threads
     t1.start();
     for(int i=0;i<10;i++)
    	 t[i].start();

     // t1 finishes before t2
     t1.join();
     for(int i=0;i<10;i++)
    	 t[i].join();
 }
}