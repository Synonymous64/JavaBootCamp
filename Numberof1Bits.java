//! '>>>' operator is used for unsigned int only.
//! '>>' operator is used for signed int only.
public class Numberof1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        Numberof1Bits p = new Numberof1Bits();
        System.out.println(p.hammingWeight(n));
    }
}
