interface sampleFace{
    void meth1();
    void meth2();
}
interface childSampleFace extends sampleFace{
    // void meth1();
    // void meth2(); //* it is not neccessary to add the methods of superClass in inheritance of interfaces
    void meth3();
    void meth4();
}
class mySampleClass implements childSampleFace{
    public void meth1(){
        System.out.println("THIS IS METH1");
    }
    public void meth2(){
        System.out.println("THIS IS METH1");
    }
    //* Due to inheritance the sampleFace of m3eth1 and meth2 are also included to it --> so we have to add them as well
    public void meth3(){
        System.out.println("THIS IS METH3");
    }
    public void meth4(){
        System.out.println("THIS IS METH3");
    }
}
public class inheritanceininterfaces {
    public static void main(String[] args) {
        
    }
}
