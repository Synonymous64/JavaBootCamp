// import java.util.Arrays;
// public class rought {
//     public static int brokenCalc(int startValue, int target) {
//         int count = 0;
//         while(target > startValue){
//             if(target % 2 == 0) target /= 2;
//             else target++;
//             count++;
//         }
//         return count + startValue - target;
//     }
//     public static int numRescueBoats(int[] people, int limit) {
//         int boat = 0, low = 0, high = people.length - 1;
//         Arrays.sort(people);
//         while(low <= high){
//             if(people[low] + people[high] <= limit) low++;
//             high--;
//             boat++;
//         }
//         return boat;
//     }
//     public static void main(String[] args) {
//         // int count1 = 0;
//         // count1 = brokenCalc(2, 3);
//         // System.out.println(count1);
//         int[] people = {3,2,2,1};
//         int p = 3;
//         System.out.println(numRescueBoats(people, p));
//     }
// }
// class Solution {
//     public int maxArea(int[] height) {
//         int water = 0, left = 0, right = height.length - 1;
//         while(left < right){
//             water = Math.max(water, Math.min(height[left], height[right]) * (right - left));
//             if(height[left] < height[right]) left++;
//             else right--;
//         }
//         return water;
//     }
// }
// public class rought{
//     public static void main(String[] args) {
//         Solution s = new Solution();
//         int[] height = {1,8,6,2,5,4,8,3,7};
//         System.out.println(s.maxArea(height));
//     }
// }

import java.util.*;
class Employe {
    int Salary;
    String Name;

    public int getSalary(){
      return Salary;
    }
    public String getName(){
        return Name;
      }
    public void setName(String n){
        Name=n;
      }
    }

 class CellPhone{
    public void ringing(){
        System.out.println("Ringing");
    }
    public void Vibrating(){
        System.out.println("Vibrating");
    }
    public void CallFriend(){
        System.out.println("CallFriend");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int l,b;
     public int area(){
        return l*b;
     }
     public int perimeter(){
        return 2*(l+b);
     }
}
public class Employee{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
   /*  //Problem1
   Employe manjiri=new Employe();
   manjiri.Salary=233;
   manjiri.setName("CodeWithmanjiri");
   System.out.println(manjiri.getName());
   System.out.println(manjiri.getSalary());

   //Problem2
   CellPhone manu=new CellPhone();
   manu.Vibrating();
   manu.ringing();
   manu.CallFriend();
   */


  //problem3
  Square sq=new Square();
  sq.side=23;
  System.out.println("Area is = " +sq.area());
  System.out.println("Perimeter is = "+sq.perimeter());

  //problem4
   Rectangle rc=new Rectangle();
   int l,b;
   System.out.println("Enter the Length of Rectangle=");
   l=sc.next.Int();
   System.out.println("Enter the Breadth of Rectangle=");
   b=sc.next.Int();
   System.out.println("The Area of Rectangle is:"+sq.area());
   System.out.println("The Perimeter of Rectangle is:"+sq.perimeter());
}
}