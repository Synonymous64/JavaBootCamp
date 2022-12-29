public class multiThreading {
    public multiThreading() {
        Thread countDownThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Count down Begins!");
                for (int i = 10; i >= 1; --i) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception x) {
                        x.printStackTrace();
                    }
                }
            }
        }, "countDownThread");
        countDownThread.start();
        try {
            countDownThread.join();
        } catch (Exception x) {
            x.printStackTrace();
        }
        System.out.println("Chandrayaan 2 Launched");
    }
    public static void main(String[] args) {
        new multiThreading();
    }
}
