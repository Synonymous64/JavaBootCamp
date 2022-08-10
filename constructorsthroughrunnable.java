class myT1 implements Runnable{
    @Override
    myT1(String name){
        super(name);
    }
    public void run(){
        System.out.println("This is my first Runnable thread");
    }
}


public class constructorsthroughrunnable {
    public static void main(String[] args) {
        myT1 t = new myT1("Prajwal");
        Thread gun = new Thread(t);
        System.out.println(gun.getName());
        System.out.println(gun.getId());
        gun.start();
    }
}
