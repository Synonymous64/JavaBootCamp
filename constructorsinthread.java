class myThread extends Thread{
    public myThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am a thread");
    }
}

public class constructorsinthread{
    public static void main(String[] args) {
        myThread t1 = new myThread("Prajwal");
        myThread t2 = new myThread("Ayush");
        t1.start(); 
        t2.start();  
        System.out.println("The ID of the thread t is " + t1.getId()); //* You can get the idea of this thread by using this method     
        System.out.println("This method in threads are " + t1.getName()); //*It will give you the name of the thread 
        System.out.println("The ID of the thread t is " + t2.getId()); //* You can get the idea of this thread by using this method     
        System.out.println("This method in threads are " + t2.getName()); //*It will give you the name of the thread 
    }
}