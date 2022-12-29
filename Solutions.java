// ! Question 13
class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 15; ++i) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 15; i >= 1; --i) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Solutions {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        t1.start();
        t2.start();
    }
}
