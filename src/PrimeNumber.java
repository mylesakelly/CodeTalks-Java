// this program checks if a given number is prime
public class PrimeNumber {
    public static boolean isPrime(int number) {
//        in the isPrime method we are checking if the number is a prime
//        if the number is less than or equal to 1 than false will be returned
        if (number <= 1) {
            return false;
        }

//        for loop is used to check if the number has any divisors other than 1.
//        at each loop we are checking if the number has any other divisors besides one and itself
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
//            if the loop finishes without finding any other divisors that true is returned
        }
        return true;
    }

    public static void main(String[] args) {
//        checking if the number 17 is a prime number
        int number = 17;
//        if the isPrime function determines the number is a prime or not one of the 2 statements will print.
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}


