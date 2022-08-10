//! Program to Encrypt
public class encrypt {
    public static void main(String[] args) {
        char grade = 'A';
        // Encrypting the grade
        grade = (char)(grade + '8'); // simple type casting
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - '8');
        System.out.println(grade);
    }
}
