class mythreadRunnable1 implements Runnable{
    public void run(){
        int i = 100;
        while(i >= 0){
            System.out.println("This is Runnable method1");
            i--;
        }
    }
}
class mythreadRunnable2 implements Runnable{
    public void run(){
        int i = 100;
        while(i >= 0){
            System.out.println("This is Runnable method2");
            i--;
        }
    }
}

public class javathreadrunnableinterface {
    public static void main(String[] args) {
        mythreadRunnable1 bullet1 = new mythreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        mythreadRunnable2 bullet2 = new mythreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        // gun1.start();
        // gun2.start();
        System.out.println(gun1.getName());
        System.out.println(gun2.getName());
    }
}
