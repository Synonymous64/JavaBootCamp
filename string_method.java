public class string_method {
    public static void main(String[] args) {
        String name = "Prajwal";
        System.out.println(name);   //* Simple Printing     
        System.out.println(name.length());//! For length
        System.out.println(name.toLowerCase()); //! for lowercase
        System.out.println(name.toUpperCase()); //! for uppercase
        String pip = new String("       PrajwalwithTrailing      ");
        System.out.println(pip.trim()); //! This will remove all the trailing spaces from forward only
        System.out.println(name.substring(3)); //! it will display the part of that string
        System.out.println(name.substring(1, 5)); //! Substring with start and end position
        System.out.println(name.replace('P', 'W')); //! This will replace the value from the orginal value, it will replace all the occurance  (FOR CHAR)     
        System.out.println(name.replace("Pra", "WPA")); //! This will replace the value from the orginal value, it will replace all the occurance  (FOR String)     
        System.out.println(name.startsWith("P")); //! Will return in boolean format. if it starts with the following character.
        System.out.println(name.endsWith("l")); //! Will return in boolean format. if it ends with the following character.
        System.out.println(name.charAt(2)); //! It will let you know the character of that particular index
        System.out.println(name.indexOf("P")); //! It will return the index of that particular character
        System.out.println(name.indexOf("jwal")); //! It will return the index of that particular string
        System.out.println(name.lastIndexOf("a")); //! It will give you the last occurance
        System.out.println(name.lastIndexOf("a",4)); //! It will give you the last occurance after the particular index from last
        System.out.println(name.equals("Prajwal")); //! It will check if both the following strings are equal or not 
        System.out.println(name.equalsIgnoreCase("prajwal"));//! this function ignores the uppercase and lowercase it, insensitive to case, thus matches both the strings
        System.out.println("I am escape sequence \"Double quotes\"");//! it will let you use double quotes inside the string by using "\" symbol known as escape sequence 
        String time = "23:54:20";
        String[] myTime = time.split(":");       //! The split function of string
        for(String s : myTime) System.out.println(s);
        String time1 = "23:54:20";
        String[] myTime1 = time1.split(":",2);       //! The split function of string with limits
        for(String s : myTime1) System.out.println(s);
    }
}
