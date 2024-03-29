package Assisted_Practice_L3;

public class SleepThread extends Thread 
{
    public void run() 
    {
        System.out.println("SleepThread is starting...");
        try 
        {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("SleepThread has finished.");
    }
}

