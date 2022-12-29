
// Write program in java to demonstrate valueOf ( ) and toString( ) methods.
// import java.util.*;

public class ValueofStringOf {
    private int id;
    private String name;
    private String domain;

    public ValueofStringOf(int id, String name, String domain) {
        this.id = id;
        this.name = name;
        this.domain = domain;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.domain;
    }

    public static void main(String[] args) {
        ValueofStringOf s = new ValueofStringOf(007, "Prajwal", "Developer");
        System.out.println(s);
        // Use valueOf to create wrapper objects from primitive values
        Integer intWrapper = Integer.valueOf(5);
        Double doubleWrapper = Double.valueOf(4.5);
        Boolean booleanWrapper = Boolean.valueOf(true);

        // Use toString to convert wrapper objects to strings
        String intString = intWrapper.toString();
        String doubleString = doubleWrapper.toString();
        String booleanString = booleanWrapper.toString();

        // Print the results
        System.out.println("intWrapper: " + intWrapper);
        System.out.println("doubleWrapper: " + doubleWrapper);
        System.out.println("booleanWrapper: " + booleanWrapper);

        System.out.println("intString: " + intString);
        System.out.println("doubleString: " + doubleString);
        System.out.println("booleanString: " + booleanString);
    }
}
