import static java.lang.Math.sqrt;
/**
 * Created by chuck on 1/23/14.
 */
public class Main {
    public static void main(String[] args) {
        int test = 1000;
        System.out.println(sumPrimes(test));
    }

    public static boolean isPrime ( int i){
        int count;

        /*
            Iterate a count from the bottom to test if the number is a prime number
            If the integer given is divisible by "count" method is false.
         */
        for (count = 2; count < i ; count++) {
            if (i % count == 0) {
                return false;
            }
        }
        if (i == 1) {
            return false;
        }
        return true;
    }

    public static int sumPrimes(int i){
        int count;
        int result = 0;
        int primes = 0;
        for(count = 0; primes <= 1000; count++){
            if(isPrime(count)){
                result += count;
                primes++;
            }
        }
        return result;
    }

}
