
/*

3. a) Write a program in java to read ixj matrix and find
i) The average of each row.
ii) The average of each column.
iii) The average of all the ixj entries.
iv) Max & min element in array

*/
import java.util.*;

public class Exam {
    void matrixOps(){
        int rows, cols;
        System.out.println("Enter the total number of rows");
        Scanner sc = new Scanner(System.in);
        cols = sc.nextInt();
        System.out.println("Enter the total number of cols");
        rows = sc.nextInt();

        System.out.println("Enter values in the matrix");
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; ++i)
            for(int j = 0; j < cols; ++j)
                matrix[i][j] = sc.nextInt();
        // Average rows
        for(int i = 0; i < rows; ++i){
            int sum = 0;
            for(int j = 0; j < cols; ++j){
                sum += matrix[i][j];
            }
            int res = sum/ rows;
            System.out.println("rows: "+  res);
        }
        // Aversage cols
        for(int j = 0; j < cols; ++j){
            int sum = 0;
            for(int i = 0; i < rows; ++i){
                sum += matrix[i][j];
            }
            int res = sum / cols;
            System.out.println("cols: " + res); 
        }
        // Min and Max
        int min = matrix[0][0], max = matrix[0][0];
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j){
                if(min > matrix[i][j]) min = matrix[i][j];
                if(max < matrix[i][j]) max = matrix[i][j];
            }
        }
        System.out.println(min + " " + max);
        sc.close();
    }
    public static void main(String[] args) {
        Exam m = new Exam();
        m.matrixOps();
    }
}

// Enter the total number of rows
// 2
// Enter the total number of cols
// 2
// Enter values in the matrix
// 1 2 3 4
// rows: 1
// rows: 3
// cols: 2
// cols: 3
// 1 4