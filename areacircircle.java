import java.util.*;
class areacircircle {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=10;i++){
        System.out.println("Enter the radius of circle:");
        float rd=sc.nextFloat();
        float area=(float)(2*3.14*rd);
        float peri=(float)(3.14*rd*rd);
        System.out.println("The area of circle is:"+area);
        System.out.println("The peri of circle is:"+peri);
        }
        sc.close();
    }
}
