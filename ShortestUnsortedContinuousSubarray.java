import java.util.*;
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int n = nums.length, i = 0, j = n - 1;
        while(i < n && nums[i] == sorted[i]) i++;
        while(j > i && nums[j] == sorted[j])j--;
        return j -i  + 1;
    }
    public static void main(String[] args) {
        int[] nums ={2,6,4,8,10,9,15};
        ShortestUnsortedContinuousSubarray s = new ShortestUnsortedContinuousSubarray();
        System.out.println(s.findUnsortedSubarray(nums));
    }
}
