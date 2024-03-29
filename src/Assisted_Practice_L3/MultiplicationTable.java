package Assisted_Practice_L3;

class MultiplicationTable implements Runnable 
{
    private int number;
    private int range;

    public MultiplicationTable(int number, int range) 
    {
        this.number = number;
        this.range = range;
    }

    @Override
    public void run() 
    {
        for (int i = 1; i <= range; i++) 
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}