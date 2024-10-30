class Currentthread
{
    public static void main(String args[])
    {
        System.out.println("Let us find the current thread:");
        Thread t=Thread.currentThread();
        System.out.println("Current Thread= "+t);
        System.out.println("Its name= "+t.getName());
    }
}