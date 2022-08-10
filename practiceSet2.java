public class practiceSet2 {
    public static void main(String[] args) {
        //! convert uppercase to lower case
        // String s = "Prajwal";
        // System.out.println(s.toLowerCase());
        //! Replace spaces with underscores
        String s = "Hello there myself Prajwal";
        System.out.println(s.replace(" ", "_")); 
        //! program to fill in a letter template which looks like below -:
        String letter = "Dear <|name|>, thanks a lot";
        System.out.println(letter.replace("<|name|>", "Prajwal"));
        //! program to detect the double and triple spaces 
        String space = "Prajwal  Urkude";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));
        //! program to format the string in letter format
        String sp = "Dear Prajwal, This Java course is nice thanks";
        sp = new String("Dear Prajwal, \n\tThis Java course is nice.\n\tThanks");
        System.out.println(sp);

    }
}
