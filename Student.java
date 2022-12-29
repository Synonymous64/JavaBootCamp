class Studen{
    String name;
    int rollno;
    void setdata(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println("The name of student is:"+name);
        System.out.println("The name of student is:"+rollno);
    }
}

class Exam extends Studen{
    int marks[];
    void setdata(String name,int rollno,int[] marks){
        super.setdata(name, rollno);
        this.marks = marks;
    }

    void display(){
        super.display();
        System.out.println("Obtain marks:"); 
        for(int i=0;i<marks.length;i++){
            System.out.println("Subject "+(i+1)+ ":" + marks[i]);
        }
    }
}
class Result extends Exam{
    int total;
    float percentage;

    void process(){
            total=0;
            int cnt=0;
            for(int i=0;i<marks.length;i++)
            {
                total+=marks[i];
                cnt++;
            }
            percentage=total/cnt;
        }
        void display(){
            super.display();
            System.out.println("The total marks obtain by student is:"+total);
            System.out.println("The total percentage obtain by student is:"+percentage);
        }
}
public class Student{
    public static void main(String[]args){
        String name="manjiri Dhavtode";
        int rollno=34;
        int marks[]={23,45,67,89,23};
        Result obj=new Result();
        obj.setdata(name,rollno,marks);
        obj.process();
        obj.display();
    }
}
