public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < nums.length; ++i){
            n ^= i ^ nums[i];
        }
        return n;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,3};
        MissingNumber m = new MissingNumber();
        System.out.println(m.missingNumber(nums));
    }
}
