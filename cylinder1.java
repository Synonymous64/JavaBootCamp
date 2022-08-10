class cylin {
    private int length, height;

    public cylin(int length, int height) {
        this.length = length;
        this.height = height;
    }
    public cylin() {
        this.length = 0;
        this.height = 0;
    }

    public int getheight() {
        return height;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public int getlength() {
        return length;
    }

    public void setlength(int length) {
        this.length = length;
    }

    public int Area() {
        return length * height;
    }

    public int Perimeter() {
        return 2 * (length * height);
    }
}

public class cylinder1{
    public static void main(String[] args) {
        cylin cr= new cylin(5,8);

        // prob1
       //cr.setlength(34);
       //cr.setheight(2);
        System.out.println(cr.getlength());
        System.out.println(cr.getheight());

        // prob2
        System.out.println("The Area of square is:" + cr.Area());
        System.out.println("The Perimeter of square is:" + cr.Perimeter());
    }
}