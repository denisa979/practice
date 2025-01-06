package practiceCoding;

public class PrimeNumber {
    public static void main(String[] args) {
       boolean result = isPrime(4);
        System.out.println("result = " + result);
    }

    private static boolean isPrime(int number) {
         if(number<2)
             return false;

         boolean isPrime=true;

        for (int i = 2; i <= number/2; i++) {
           if(number%i==0){
               isPrime = false;
               break;
           }
        }
        return isPrime;
    }
}

//prime number is number that is divisible by 1 or itself