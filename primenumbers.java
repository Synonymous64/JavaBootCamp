import java.lang.Boolean;
class PrimeNumbers{
    //* correct way-:
    public void findingPrime(int nums){
        Boolean isPrime[] = new Boolean[nums + 1];
        for(int i = 0; i <= nums; ++i) isPrime[i] = true; 
        for(int i = 2; i <= nums; ++i){
            if(isPrime[i] == true){
                for(int j = 2 * i; j <= nums; j += i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 0; i < nums; ++i){
            if(isPrime[i] == true){
                System.out.println(i);
            }
        }
    }
}
public class primenumbers {
    public static void main(String[] args) {
        PrimeNumbers p = new PrimeNumbers();
        p.findingPrime(100);
    }
}
