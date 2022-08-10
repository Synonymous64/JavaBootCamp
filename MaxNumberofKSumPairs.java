import java.util.*;
public class MaxNumberofKSumPairs {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            //to check if that k-nums[i] present and had some value left or already paired
            if(map.containsKey(k-nums[i])&&map.get(k-nums[i])>0){
                count++;
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }else{
                //getOrDefault is easy way it directly checks if value is 0 returns 0 where I added 1
                //and if some value is present then it return that value "similar to map.get(i)" and I added 1 on it 
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
    public int maxOperations1(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1, count = 0;
        while(i < j){
            if(nums[i] + nums[j] == k){
                count++;
                i++;j--;
            }
            else if(nums[i] + nums[j] < k){
                i++;
            }
            else j--;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        MaxNumberofKSumPairs s = new MaxNumberofKSumPairs();
        System.out.println(s.maxOperations1(nums, k));        
    }
}
