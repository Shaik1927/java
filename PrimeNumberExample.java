import java.util.Scanner;
class PrimeNumberExample {

    public static void main(String args[]) {

       
        System.out.println("Enter the amount of prime numbers to be printed: ");
        int limit = new Scanner(System.in).nextInt();
        int count=0;

        
        System.out.println("Printing prime number from 1 to " + limit);
        for(int number = 2; number<=limit; number++){
    
            if(isPrime(number)){
                System.out.println(number);
                count++; 
            }
        }

    }

    /*
     * Prime number is not divisible by any number other than 1 and itself
     * @return true if number is prime
     */
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return false; //number is divisible so its not prime
            }
        }
        return true; //number is prime now
    }
}
