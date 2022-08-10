import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class practiceSet15{
    public void myArrayList(){
        System.out.println("Enter the limit of the array");
        int size;
        int it = 10;
        while(it == 10){
            try{
                Scanner sc = new Scanner(System.in);
                size = sc.nextInt();
                it = 11;
                ArrayList<String> arr = new ArrayList<>(size + 1);
                System.out.println("Enter the names in the string");
                String s;
                for(int i = 0; i < size+1; ++i){
                    s = sc.nextLine();
                    arr.add(i, s);
                }
                String p = "Prajwal";
                if(arr.contains(p)){
                    System.out.println("Found");
                    
                }
                else System.out.println("Not found");
                sc.close();
                for(Object i : arr){
                    System.out.print(i + " ");
                }
            }
            catch(Exception e){
                System.out.println("Invalid input");
                continue;
            }
        }
    }
    void implementSet(){
        HashSet<Integer> h = new HashSet<>(5);
        System.out.println("Enter Elements till 5");
        int s = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; ++i){
            s = sc.nextInt();
            h.add(s);
        }
        System.out.println("The elements are - : ");
        for(Object i : h){
            System.out.println(i);
        }
        sc.close();
    }
    void DateImplementation(){
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(c.HOUR_OF_DAY) + ":" + c.get(c.MINUTE) + ":" + c.get(c.SECOND));
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); //* we can create any format through this but the date time symbols remains the same
        String myDate4 = dt.format(df4);
        System.out.println(myDate4);
    }
    public static void main(String[] args) {
        practiceSet15 p = new practiceSet15();
        // p.myArrayList();
        // p.implementSet();
        p.DateImplementation();
    }
}