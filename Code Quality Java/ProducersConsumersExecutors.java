package com.au.threading;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducersConsumersExecutors {
	private static final Logger LOGGER=Logger.getLogger(ProducersConsumersExecutors.class.getName());
	public static void main(String[] args)
    {
        try
        {
            Broker broker = new Broker();
 
            ExecutorService threadPool = Executors.newFixedThreadPool(11);
 
 
            threadPool.execute(new Consumer("1", broker));
            threadPool.execute(new Consumer("2", broker));
            threadPool.execute(new Consumer("3", broker));
            threadPool.execute(new Consumer("4", broker));
            threadPool.execute(new Consumer("5", broker));
            threadPool.execute(new Consumer("6", broker));
            threadPool.execute(new Consumer("7", broker));
            threadPool.execute(new Consumer("8", broker));
            threadPool.execute(new Consumer("9", broker));
            threadPool.execute(new Consumer("10", broker));
            Future producerStatus = threadPool.submit(new Producer(broker));
 
            // this will wait for the producer to finish its execution.
            producerStatus.get();
 
 
            threadPool.shutdown();
        }
        catch (Exception e)
        {
        	LOGGER.log(Level.WARNING, "Interrupted1!", e);
    	    // Restore interrupted state...
    	    Thread.currentThread().interrupt();
     
        }
    }
}

class Producer implements Runnable
{  private static final Logger LOGGER=Logger.getLogger(Producer.class.getName());
    private Broker broker;
 
    public Producer(Broker broker)
    {
        this.broker = broker;
    }
 
 
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<10;i++)
            {
                LOGGER.log(Level.INFO,"OUTPUT", "Producer produced: " + i);
                Thread.sleep(100);
                broker.put(i);
            }
 
            this.broker.setContinueProducing(Boolean.FALSE);
            LOGGER.log(Level.INFO,"Producer finished its job; terminating.");
        }
        catch (InterruptedException ex)
        {
        	LOGGER.log(Level.WARNING, "Interrupted!", ex);
    	    // Restore interrupted state...
    	    Thread.currentThread().interrupt();
        }
 
    }
}

class Consumer implements Runnable
{ private static final Logger LOGGER=Logger.getLogger(Consumer.class.getName());
 
    private String name;
    private Broker broker;
 
 
    public Consumer(String name, Broker broker)
    {
        this.name = name;
        this.broker = broker;
    }
 
 
    @Override
    public void run()
    {
        try
        {
            Integer data = broker.get();
 
            while (broker.getContinueProducing() || data != null)
            {
                Thread.sleep(1000);
                LOGGER.log(Level.INFO,"OUTPUT1","Consumer " + this.name + " processed data from broker: " + data);
 
                data = broker.get();
            }
 
 
            LOGGER.log(Level.INFO,"OUTPUT3","Comsumer " + this.name + " finished its job; terminating.");
        }
        catch (InterruptedException ex)
        {
        	LOGGER.log(Level.WARNING, "Interrupted!", ex);
    	    // Restore interrupted state...
    	    Thread.currentThread().interrupt();
        }
    }
 
}

class Broker
{
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(100);
    private Boolean continueProducing = Boolean.TRUE;
 
    public void put(Integer data) throws InterruptedException
    {
        this.queue.put(data);
    }
 
    public Integer get() throws InterruptedException
    {
        return this.queue.poll(1, TimeUnit.SECONDS);
    }

	public Boolean getContinueProducing() {
		return continueProducing;
	}

	public void setContinueProducing(Boolean continueProducing) {
		this.continueProducing = continueProducing;
	}
}