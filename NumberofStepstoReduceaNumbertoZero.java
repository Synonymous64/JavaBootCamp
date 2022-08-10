public class NumberofStepstoReduceaNumbertoZero{
    public int numberOfSteps(int num) {
        int count = 0;
        while(num != 0){
            if((num & 1) == 1) num -= 1;
            else num /=2;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 123;
        NumberofStepstoReduceaNumbertoZero s = new NumberofStepstoReduceaNumbertoZero();
        System.out.println(s.numberOfSteps(num));
    }
}