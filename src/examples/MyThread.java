package examples;

public class MyThread extends Thread
{

    @Override
    public void run()
    {
        System.out.println("Thread's name: " + this.getName());
        System.out.println("Thread's priority: " + this.getPriority());
        System.out.println("Thread's ID: " + this.getId());
    }

    // temporary tester to kick off this thread ^
    // main is its OWN thread
    public static void main(String[] args)
    {
        MyThread t = new MyThread();

        // dont do this - will not have two threads - main and t
        //t.run();

        t.start(); // invisible call to run
    }
}
