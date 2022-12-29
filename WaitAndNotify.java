class temp {
    public int num;
    boolean valueSet = false;
    public synchronized void set(int num) {
        while(valueSet){
            try{ wait(); } catch(Exception x){x.printStackTrace();} 
        }
        this.num = num;
        System.out.println("set:" + num);
        valueSet = true;
        notify();
    }

    public synchronized void get() {
        while(!valueSet){
            try{ wait(); } catch(Exception x){x.printStackTrace();} 
        }
        System.out.println("get:" + num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            t.set(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }

    temp t = new temp();

    Producer(temp t) {
        this.t = t;
        Thread t1 = new Thread(this, "Producer");
        t1.start();
    }

}

class Consumer implements Runnable {
    temp t = new temp();

    public Consumer(temp t) {
        this.t = t;
        Thread t1 = new Thread(this, "Consumer");
        t1.start();
    }

    @Override
    public void run() {
        while (true) {
            t.get();
            try {
                Thread.sleep(1000);
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }
}

public class WaitAndNotify {
    public static void main(String[] args) {
        temp t = new temp();
        new Consumer(t);
        new Producer(t);
    }
}
