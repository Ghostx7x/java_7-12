public class MyRunnable implements Runnable
{
    private String threadName;
    public MyRunnable(String name)
    {
        this.threadName = name;
    }
    @Override
    public void run()
    {
        try
        {
            for(int i = 5;i <= 5;i++)
            {
                System.out.println(threadName+": Count - " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(threadName+" thread interrupted");
        }
        System.out.println(threadName+" thread exiting");
    }
}
