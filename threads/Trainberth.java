class Mythread implements Runnable
{
    int available=1;
    int wanted;
    
    Reserve(int i)
    {
        wanted=i;
        
    }

    public void run()
    {
        System.out.println("Available Berts= "+available);
        if(available >=wanted)
        {
            String name=Thread.currentThread().getName();
            System.out.println(wanted+ " Berths reserved for "+name);
            try{
                Thread.sleep(1500);
                available=available-wanted;
            }
            catch(InterruptedException ie)
            {
                
            }
        }
        else
            System.out.println("Sorry, no berths available");
    }
}

class Trainberth
{
    public static void main(String args[])
    {
        Reserve ob=new Reserve(1);
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob);

        t1.setName("First Person");
        t2.setName("Second Person");

        t1.start();
        t2.start();
    }
}