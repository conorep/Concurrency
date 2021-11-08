package examples;

import org.w3c.dom.css.Counter;

public class CounterThread extends Thread
{
    // instance fields, not class. no static, not a class field.
    private int low;
    private int high;

    public CounterThread(int low, int high)
    {
        this.low = low;
        this.high = high;
    }

    @Override
    public void run()
    {
        for (int i = low; i <= high; i++)
        {
            System.out.println(this.getName() + ": " + i);
        }
    }

    // tester main
    public static void main(String[] args)
    {
        Thread[] threads = {
                new CounterThread(1, 10),
                new CounterThread(11, 20),
                new CounterThread(21, 30),
                new CounterThread(31, 40)

        };
//        CounterThread t = new CounterThread(1, 20);
//        t.start();

        for (int i = 0; i < threads.length; i++)
        {
            threads[i].start();
        }

        for (int i = 41; i < 50; i++)
        {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

    }

}
