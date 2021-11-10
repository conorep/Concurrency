package racecondition;

public class WorkerClient
{
    public static void main(String[] args) throws InterruptedException
    {
        // construct a worker thread that is in New state
        WorkerThread worker = new WorkerThread();
        Thread t = new Thread(worker);


        // make the thread Runnable
        t.start();

        // main method goes to sleep for one second
        // another thing could interrupt it, so need to throws Interrupted
        // could use try-catch
        //Thread.sleep(500);


        // use join method so main waits until worker t thread is finished
        t.join(); // main thread is in waiting state now

        // main thread print out sum
        System.out.println(worker.getSum());

    }
}
