package threadtiming;

public class StoryBookThread implements Runnable
{
    private static final  int PERIOD_COUNT = 10;

    private Thread thread; // will store reference to main thread

    public StoryBookThread(Thread t)
    {
        thread = t;
    }

    public void run()
    {
        System.out.println("Welcome to my storybook!");
        try
        {
            Thread.sleep(2000);
            System.out.print("The story began long, long ago");
            for (int i = 0; i < PERIOD_COUNT; i++)
            {
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.print("\n");
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
