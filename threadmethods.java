class myThread1 extends Thread{
    myThread1(String name){
        super(name);
    }
    public void run(){
        int i = 100;
        while(--i >= 0){
            System.out.println("Yo wassup mate, " + this.getName() + "!");
            try {
                
                Thread.sleep(455); //* Slow execution speed
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class myThread2 extends Thread{
    myThread2(String name){
        super(name);
    }
    public void run(){
        int i = 100;
        while(--i >= 0){
            System.out.println("Yo wassup mate, " + this.getName() + "!");
        }
    }
}


public class threadmethods {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1("Prajwal");
        myThread2 t2 = new myThread2("Ayush");
        t1.start();
        // try{
        //     t1.join(); //* This will make sure to run after the t1 execution ends else it both the thread will executed together.
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();
        // System.out.println(t1.getName());
    }
}
