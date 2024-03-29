package Assisted_Practice_L3;

class WaitThread extends Thread 
{
    private Object lock;

    public WaitThread(Object lock) 
    {
        this.lock = lock;
    }

    public void run() 
    {
        synchronized (lock) 
        {
            System.out.println("WaitThread is starting...");
            try 
            {
                lock.wait(2000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println("WaitThread has finished.");
        }
    }
}
