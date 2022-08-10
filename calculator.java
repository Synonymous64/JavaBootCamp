// package Practiceset12;

import java.util.Scanner;

// class SuperClass{
//     public void method(){
//         System.out.println("Press s/S to shout");
//         Scanner sc = new Scanner(System.in);
//         String s1;
//         s1 = sc.nextLine();
//         if(s1.equals("s") || s1.equals("S")) System.out.println("Shouting");
//         else System.out.println("NONE");
//         sc.close();
//     }
//     private void method1(){
//         System.out.println("The is private");
//     }
//     protected void method2(){
//         System.out.println("This is protected");
//     }
// }
public class calculator {
    public void method(){
        System.out.println("Press s/S to shout");
        
        Scanner sc = new Scanner(System.in);
        String s1;
        s1 = sc.nextLine();
        if(s1.equals("s") || s1.equals("S")) System.out.println("Shouting");
        else System.out.println("NONE");
        sc.close();
    }
    private void method1(){
        System.out.println("The is private");
    }
    protected void method2(){
        System.out.println("This is protected");
    }
    public static void main(String[] args) {
        System.out.println("This is a normal Calculator");
        calculator s = new calculator();
        s.method();
    }
}
