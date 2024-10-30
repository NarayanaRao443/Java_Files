class Mythread implements Runnable
{
    public void run()
    {
        task1();
        task2();
        task3();
    }

    void task1()
    {
        System.out.println("This is task 1");
    }
    void task2()
    {
        System.out.println("This is task 2");
    }
    void task3()
    {
        System.out.println("This is task3");
    }
}

class Singlethread
{
    public static void main(String args[])
    {
        Mythread ob=new Mythread();
        Thread t1=new Thread(ob);
        t1.start();
    }
}