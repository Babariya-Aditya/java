package pu;

class buy
{
    private int materials;
    private boolean available = false;
    public synchronized int get()
    {
        while (available == false)
        {
            try
            {
                wait();
            }
            catch (InterruptedException ie)
            {
            }
        }
        available = false;
        notifyAll();
        return materials;
    }
    public synchronized void put(int value)
    {
        while (available == true)
        {
            try
            {
                wait();
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        materials = value;
        available = true;
        notifyAll();
    }
}
class Consumer extends Thread
{
    private buy buy;
    private int number;
    public Consumer(buy c, int number)
    {
        buy = c;
        this.number = number;
    }
    public void run()
    {
        int value = 0;
        for (int i = 0; i < 10; i++)
        {
            value = buy.get();
            System.out.println("Consume values is " + this.number+ " got: " + value);
        }
    }
}
class Producer extends Thread
{
    private buy buy;
    private int number;

    public Producer(buy c, int number)
    {
        buy = c;
        this.number = number;
    }
    public void run()
    {
        for (int i = 0; i < 4; i++)
        {
            buy.put(i);
            System.out.println("Produce value is " + this.number+ " put: " + i);
            try
            {
                sleep((int)(Math.random() * 100));
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}
public class p23
{
    public static void main(String[] args)
    {
        buy c = new buy();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        p1.start();
        c1.start();
    }
}