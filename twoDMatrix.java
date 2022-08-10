class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        for(int i = m - 1, j = 0; i >= 0 && j < n;){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) j++;
            else i--;
        }
        return false;
        
    }
}
public class twoDMatrix{
    public static void main(String[] args) {
       int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       int target = 3;
       Solution G = new Solution();
       System.out.println(G.searchMatrix(matrix, target));
       
    }       
}