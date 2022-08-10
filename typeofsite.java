import java.util.Scanner;

public class typeofsite {
    public static void main(String[] args) {
        String site;
        Scanner sc = new Scanner(System.in);
        site = sc.nextLine();
        if(site.endsWith(".com")) System.out.println("Commercial Website");
        if(site.endsWith(".org")) System.out.println("Organization Website");
        if(site.endsWith(".in")) System.out.println("Indian Website");
        sc.close();
    }
}
