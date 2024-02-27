public class MyThread extends Thread
{
    public MyThread(String threadName)
    {
        super(threadName);
        start();
    }

    @Override
    public void run()
    {
        try
        {
            for(int i = 1; i <= 5; i++)
            {
                System.out.println(Thread.currentThread().getName() + ": Count - "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(Thread.currentThread().getName() + " Thread Interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " Thread Exiting");
    }
}
