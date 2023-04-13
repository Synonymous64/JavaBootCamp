import java.util.*;
public class ArrayA123{
    public static boolean findDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; ++i){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(findDuplicate(arr));
    }
}