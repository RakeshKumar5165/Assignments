package com.au.threading;

import java.util.LinkedList;

public class ProConMain
{
 public static void main(String[] args)
                     throws InterruptedException
 {
     // Object of a class that has both produce()
     // and consume() methods
      ProducersConsumers a = new ProducersConsumers();

     // Create producer thread
     Thread t1 = new Thread(new Runnable()
     {
         @Override
         public void run()
         {
             try
             {
                 a.produce();
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
             }
         }
     });

     Thread[] t = new Thread[10];
     // Create consumer thread1
     for(int i=0;i<10;i++){
     Thread t2 = new Thread(new Runnable()
     {
         @Override
         public void run()
         {
             try
             {
                 a.consume();
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
             }
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