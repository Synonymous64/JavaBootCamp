public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j){
            if(nums[j] % 2 == 0){
                if(nums[i] % 2 != 0){
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                    i++; j--;
                } 
                else i++;
            }
            else j--;
        }
        return nums;
    }
    public static void main(String[] args) {
        
    }
}
