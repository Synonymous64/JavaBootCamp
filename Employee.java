import java.util.*;

class Employe {
    int Salary;
    String Name;

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }
}

class CellPhone {
    public void ringing() {
        System.out.println("Ringing");
    }

    public void Vibrating() {
        System.out.println("Vibrating");
    }

    public void CallFriend() {
        System.out.println("CallFriend");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Rectangle {
    int l, b;

    public int area() {
        return l * b;
    }

    public int perimeter() {
        return 2 * (l + b);
    }
}

class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * //Problem1
         * Employe manjiri=new Employe();
         * manjiri.Salary=233;
         * manjiri.setName("CodeWithmanjiri");
         * System.out.println(manjiri.getName());
         * System.out.println(manjiri.getSalary());
         * 
         * //Problem2
         * CellPhone manu=new CellPhone();
         * manu.Vibrating();
         * manu.ringing();
         * manu.CallFriend();
         */

        // problem3
        Square sq = new Square();
        sq.side = 23;
        System.out.println("Area is = " + sq.area());
        System.out.println("Perimeter is = " + sq.perimeter());

        // problem4
        Rectangle rc = new Rectangle();
        System.out.println("Enter the Length of Rectangle=");
        rc.l = sc.nextInt();
        System.out.println("Enter the Breadth of Rectangle=");
        rc.b = sc.nextInt();
        System.out.println("The Area of Rectangle is:" + rc.area());
        System.out.println("The Perimeter of Rectangle is:" + rc.perimeter());
        sc.close();
    }
}
