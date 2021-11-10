package threadtiming;


public class StoryBookClient
{
    public static void main(String[] args) throws InterruptedException
    {
        // construct a StoryBook Thread (pass a reference to the main thread
        // in the StoryBookThread Constructor)
        StoryBookThread story = new StoryBookThread(Thread.currentThread());
        Thread storybookThread = new Thread(story); //new state

        storybookThread.start();
        storybookThread.join();

        System.out.println("And they lived happily ever after!");
    }
}
