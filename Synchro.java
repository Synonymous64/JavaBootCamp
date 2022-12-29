public class Synchro {
    public int count = 0;
    public synchronized void increment(){
        count++;
    }
    public static void main(String[] args) {
        Synchro s = new Synchro();
        // s.increment();
        // s.increment();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 1; i <= 1000; ++i) s.increment();
            }
        });
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 1; i <= 1000; ++i) s.increment();
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
            System.out.println(s.count);
        } catch(Exception x){
            x.printStackTrace();
        }
    }
}
