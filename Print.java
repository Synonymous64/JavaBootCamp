interface Marks {
    int sportwt = 5;
}

class Student {
    int rollno;
    String name;
    int total;
}

public class Print extends Student implements Marks {
    public static void main(String[] args) {
        Print p = new Print();
        p.name = "Prajwal";
        p.rollno = 143;
        p.total = 1;
        System.out.println("name: " + p.name + " roll no. : " + p.rollno + " total: " + p.total);
    }
}
