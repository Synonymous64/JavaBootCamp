abstract class sample{
    int value = 12;
    abstract void printCode();
    abstract void setValue();
}
public class sample1 extends sample{
    @Override
    public void printCode(){
        System.out.println(this.value);
    }
    @Override
    public void setValue(){
        
    }
    public static void main(String[] args) {
        
    }
}
