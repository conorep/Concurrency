package interrupting;

public class AlarmThread implements Runnable
{
    private Thread thread; // will store reference to main thread

    public AlarmThread(Thread t)
    {
        thread = t;
    }

    public void run()
    {
        System.out.println("We are waking up the PersonThread.");
        thread.interrupt();
    }

}
