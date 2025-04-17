package multiThreading;

class Ex1 extends Thread
{
    private String threadName;
    public Ex1(String name)
    {
        threadName=name;
    }
    public void run()
    {

        System.out.println("Thread is Executing");
    }

}

class Example1 {
    public static void main(String[] args) {

        Ex1 ex1=new Ex1("Thread-1");
        Ex1 ex2=new Ex1("Thread-2");

        ex1.start();
        ex2.start();




    }
}

