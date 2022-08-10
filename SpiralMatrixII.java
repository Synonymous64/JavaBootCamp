class Solution {
    public int[][] generateMatrix(int n) {
        int[][] v = new int[n][n];
        int c1 = 0, c2 = n - 1;
        int r1 = 0, r2 = n - 1;
        int val = 1;
        while(c1 <= c2 && r1 <= r2){
            for(int i = c1; i <= c2; ++i) v[r1][i] = val++;
            for(int i = r1 + 1; i <= r2; ++i) v[i][c2] = val++;
            if(c1 < c2 && r1 < r2){
                for(int i = c2 - 1; i > c1; --i) v[r2][i] = val++;
                for(int i = r2; i > r1; --i) v[i][c1] = val++;
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        return v;
    }
    public void printCode(int[] nums){
        for(int i = 0; i < nums.length; ++i){
            System.out.print(nums[i] + " ");
        }
    }
}


public class SpiralMatrixII {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] A = s.generateMatrix(3);
        for(int i = 0; i < A.length; ++i){
            s.printCode(A[i]);
        }
    }
}
