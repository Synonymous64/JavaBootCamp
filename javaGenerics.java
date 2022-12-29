import java.util.*;
class myGeneric<T1, T2>{
int val;
    private T1 t1;
    private T2 t2;
    myGeneric(int value, T1 t1, T2 t2){
        this.val = value;
        this.t1 = t1;
        this.t2 = t2;
    }
    void setVal(int val){
        this.val = val;
    }
    void setT1(T1 t1){
        this.t1 = t1;
    }
    void setT2(T2 t2){
        this.t2 = t2;
    }
    int getVal(){
        return this.val;
    }
    public T1 getT1(){
        return this.t1;
    }
    public T2 getT2(){
        return this.t2;
    }
    
}
public class javaGenerics {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();
        l1.add(1);
        myGeneric <String, Integer> g1 = new myGeneric<>(34, "This is T1", 1);
        String str = g1.getT1();
        int n = g1.getVal();
        int str2 = g1.getT2();

        System.out.println(str + " " + n + " " + str2);
    }
}
