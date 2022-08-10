// import java.util.*;

// public class email {
//     void mailVerify() {
//         Scanner input = new Scanner(System.in);
//         String mail;
//         System.out.println("Enter your email");
//         mail = input.nextLine();
//         String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
//         if (mail.matches(regex)) {
//             System.out.println("o/p " + mail + " is a valid mail");
//         } else System.out.println("o/p " + mail + " is not a valid mail");
//         input.close();
//     }
//     public static void main(String[] args) {
//         email p = new email();
//         p.mailVerify();
//     }
// }

// public class email{
//     public boolean IsEmailValid(String email){
//     String[] chunks = email.split("@");
//     int count = 0;
//     for(int i = 0; i < chunks.length; ++i) count++;
//     if(count != 2) return false;

//     if (chunks[0].length() == 0 || chunks[1].length() < 3) return false;

//     if(!chunks[1].contains("."))return false;
//     for (char ch : email.toCharArray()) {
//         if(!ch)
//     }
//     email.foreach(c){
//         if (!Char.IsLetter(c) && !Char.IsNumber(c) && c != '_' && c != '.' && c != '@')
//             return false;
//     }

//     if (email.Contains("..") || email.Contains(".@") || email.Contains("@.") || email.Contains("._."))
//         return false;

//     if (email.EndsWith("."))
//         return false;

//     return true;
// }
//     public static void main(String[] args) {
        
//     }
// }

import java.util.*;


// only for gmail.......................


/*public class email {

    void mailVerify() {

        Scanner input = new Scanner(System.in);
        String mail;
        System.out.print("Enter Your email :- ");

        mail = input.nextLine();

        if (mail.endsWith("@gmail.com")) {

            System.out.println(mail + " is a valid mail");
        } else
            System.out.println(mail + " is not a valid mail");
        input.close();
    }

    public static void main(String[] args) {

        email p = new email();
        p.mailVerify();

    }
}*/


// Using via Regex.......................



/*public class email {
    void mailVerify() {
        Scanner input = new Scanner(System.in);
        String mail;
        System.out.print("Enter Your mail id :- ");
        mail = input.nextLine();
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        if (mail.matches(regex)) {
            System.out.println(mail + " is a valid mail");
        } else
            System.out.println(mail + " is not a valid mail");
        input.close();
    }
    public static void main(String[] args) {
        email p = new email();
        p.mailVerify();
    }
}*/


// for All.......................


public class email {
    boolean verify(String mail) {
        if (mail.contains("..") || mail.contains(",") || mail.contains("#") || mail.contains("%") || mail.contains("&")
                || mail.contains("*") || mail.contains("(") || mail.contains(")") || mail.contains("^")
                || mail.contains("+") || mail.contains("-") || mail.contains("/") || mail.contains("?"))
            return false;
        String[] chunk = mail.split("@");
        int count = 0;
        for (int i = 0; i < mail.length(); ++i) {
            if (mail.charAt(i) == '@') {
                count++;
            }
        }
        if (chunk[0].contains("@") || chunk[1].contains("@") || count > 1)
            return false;
        return true;
    }

    void mailVerify() {
        Scanner input = new Scanner(System.in);
        String mail;
        System.out.print("Enter you email :- ");
        mail = input.nextLine();
        int indexAt = mail.indexOf("@");
        if ((mail.endsWith(".com") || mail.endsWith(".org")) && !mail.contains(" ") && mail.contains("@")
                && verify(mail) && !mail.contains("@.com") && indexAt > 0) {
            System.out.println(mail + " is a valid mail");
        } else
            System.out.println(mail + " is not a valid mail");
        input.close();
    }

    public static void main(String[] args) {
        email p = new email();
        p.mailVerify();
    }
}