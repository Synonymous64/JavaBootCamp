class rectangle{
    private int length;
    private int breadth;
    public rectangle(){
        length = 0;
        breadth = 0;
    }
    public rectangle(int length, int breadth){
        this.breadth = breadth;
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public int getLength() {
        return length;
    }

}


public class overloadconstructors {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec = new rectangle(12,34);
        System.out.println(rec.getLength() + " " + rec.getBreadth());
    }
}
