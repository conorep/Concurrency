package startingThreads;

public class StringHolder extends Thread
{

    private String data;

    public StringHolder(String data)
    {
        this.data = data;
    }


    /**
     * A getter method to return the data value.
     * @return data's value
     */
    public String getData()
    {
        return data;
    }

    /**
     * A setter method to set the data value.
     * @param data set data value
     */
    public void setData(String data)
    {
        this.data = data;
    }

    /**
     * A run method override that outputs "Printed from thread: As I expected. The data: " and the data field's value.
     */
    @Override
    public void run()
    {
        System.out.println("Printed from thread: As I expected. The data: " + this.data);
    }

    /**
     * An overriden toString method returning the data field's value.
     * @return "The data: " + this.data;
     */
    @Override
    public String toString()
    {
        return "The data: " + this.data;
    }

    // tester main
    public static void main(String[] args)
    {
        StringHolder t = new StringHolder("MARY POPPINS, PRETTY NEAT");
        t.start();
    }
}
