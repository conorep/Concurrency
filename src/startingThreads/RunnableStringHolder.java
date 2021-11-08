package startingThreads;

public class RunnableStringHolder implements Runnable
{
    private String data;

    RunnableStringHolder(String data)
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
        int digits = 0;
        int alphaChar = 0;
        int specialChar = 0;

        for (int i = 0; i < data.length(); i++)
        {
            char character = data.charAt(i);

            if (Character.isAlphabetic(character))
            {
                alphaChar++;
            } else if (Character.isDigit(character))
            {
                digits++;
            } else if (String.valueOf(character).matches("[^A-Za-z0-9 ]"))
            {
                specialChar++;
            }
        }

        System.out.println("Printed from thread: As I expected. The data: " + this.data);
        System.out.println("String length: " + data.length());
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of alphabetic characters: " + alphaChar);
        System.out.println("Number of special characters: " + specialChar);

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
        Thread t = new Thread(new RunnableStringHolder("MARY POPPINS, PRETTY NEAT!"));
        t.start();
    }
}
