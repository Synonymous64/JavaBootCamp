public class varargs {
    public static int add(int ...arr){
        //! Available as int array
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    public static int lengthS(int sum, String ...str){
        //! Available as int array
        for (String string : str) {
            sum += string.length();
        }
        return sum;
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("It's about VarArgs");
        System.out.println(add(1,2)); 
        System.out.println(add(1,2,5,4,2,1,2)); //! you can add as much argument you wanna add | it is used to perform particular task
        int sum = 0;
        System.out.println(lengthS(sum, "Prajwal"));
    }
}
