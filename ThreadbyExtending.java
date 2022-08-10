class myThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i <= 500){
            System.out.println("My Thread is running");
            System.out.println("I am Happy");
            i++;
        }
    };
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i <= 500){
            System.out.println("My Thread2 is cooking");
            System.out.println("I am Happy 2");
            i++;
        }
    };
}
public class ThreadbyExtending {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
