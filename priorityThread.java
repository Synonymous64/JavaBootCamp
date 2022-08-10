class myThread1 extends Thread{
    public myThread1(String name){
        super(name);
    }
    public void run(){
        System.out.println("This thread is running for " + this.getName()); //* To get the name or id (this.getID());
    }
    
}
class myThread2 extends Thread{
    public myThread2(String name){
        super(name);
    }
    public void run(){
        System.out.println("The myThread2 is running");
    }
    
}

public class priorityThread {
    public static void main(String[] args) {
        //* Ready queue : T1 T2 T3 T4 T5 ~ Thread ready to run from JVM (Responisbility)
        // myThread1 t1 = new myThread1("Prajwal");
        // myThread2 t2 = new myThread2("Ayush");
        // t1.start();
        // t2.start();
        // System.out.println("The ID of Thread1 is " + t1.getId());
        // System.out.println("The ID of Thread2 is " + t2.getId());
        // System.out.println("The name of Thread1 is " + t1.getName());
        // System.out.println("The name of thread2 is " + t2.getName());
    /*
    !    java.lang.Thread.MIN_PRIORITY  = 1 (Frequeny of running is 1)
    !    java.lang.Thread.NORM_PRIORITY = 5 (Frequeny of running is 5) During LOOPS
    !    java.lang.Thread.MAX_PRIORITY  = 10 (Frequency of running is 10)
    */
        myThread1 t1 = new myThread1
        ("Prajwal");
        myThread1 t2 = new myThread1("Ayush");
        myThread1 t3 = new myThread1("Sunita");
        myThread1 t4 = new myThread1("Vilas - : Most Important"); //* Given the high priority
        myThread1 t5 = new myThread1("Urkude");
        t4.setPriority(Thread.MAX_PRIORITY); // Giving the max Priority will be the highest one to be executed maximum
        t1.setPriority(Thread.MIN_PRIORITY); // Giving the min Priority will be the least one to be executed minimum
        t2.setPriority(Thread.NORM_PRIORITY); // Giving the default Priority neither the lowest nor highest to run
        t3.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}


//! https://docs.oracle.com/javase/7/docs/technotes/guides/vm/thread-priorities.html#:~:text=The%20default%20logical%20priority%20for%20Java%20threads%20is,that%20is%20less%20then%20the%20default%20native%20priority.