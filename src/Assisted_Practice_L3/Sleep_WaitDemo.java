package Assisted_Practice_L3;

public class Sleep_WaitDemo 
{
    public static void main(String[] args) 
    {
        Object lock = new Object();

        SleepThread sleepThread = new SleepThread();
        sleepThread.start();

        WaitThread waitThread = new WaitThread(lock);
        waitThread.start();
    }
}