// the purpose of this java program is to calculate the factorial of a given number
//two methods are being used in this program, factorial and main
public class factorial {
    public static int factorial(int n) {

//        the variable result will store the final result of the calculation. It is initialized at 1
        int result = 1;
// the loop will start at 1 and then multiply the current value of result by the current loop value of i
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

//    the main method sets the number to 5, which is what we are finding the factorial result for
    public static void main(String[] args) {
//        variable number is set to 5
        int number = 5;
//        result is set to the factorial function that takes the parameter of the number
        int result = factorial(number);
//        print to the terminal that the "Factorial of number is the result"
//        in this case, it should print "Factorial of 5 is: 120"
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

