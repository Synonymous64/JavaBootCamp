class myThread extends Thread{
    myThread(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 100;
        while(--i >= 0){
            System.out.println(this.getName());
        }
    }
}
class myThread2 extends Thread{
    myThread2(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 100;
        while(--i >= 0){
            System.out.println(this.getName());
            // try{
            //     myThread2.sleep(200);
            // }
            // catch(Exception e){
            //     System.out.println(e);
            // }
        }
    }
}

public class Practiceset13 {
    public static void main(String[] args) {
        myThread t = new myThread("Good Morning");
        myThread2 t2 = new myThread2("Welcome");
        myThread t3 = new myThread("Good Evening");
        t.start();
        t2.start();
        t3.start();
        // t.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(Thread.MIN_PRIORITY);
        // t3.setPriority(Thread.NORM_PRIORITY);
        //* Other ways to keep priorities
        t.setPriority(9);
        t2.setPriority(6);
        t3.setPriority(5);
        //* For Getting Priority
        System.out.println("The priority of t is " + t.getPriority());
        System.out.println("The priority of t2 is " + t2.getPriority());
        System.out.println("The priority of t3 is " + t3.getPriority());
        //* For Getting State
        System.out.println("The state of t is " + t.getState());
        System.out.println("The state of t2 is " + t2.getState());
        System.out.println("The state of t3 is " + t3.getState());
        
        // System.out.println("The priority of t is " + t.getStackTrace());
        // System.out.println("The priority of t2 is " + t2.getStackTrace());
        // System.out.println("The priority of t3 is " + t3.getStackTrace());
        //* For Getting reference
        System.out.println("The reference of Thread is " + Thread.currentThread().getState());
        // System.out.println("The reference of t2 is " + t2.currentThread().getState());
        // System.out.println("The reference of t3 is " + t3.currentThread().getState());
    }
}




