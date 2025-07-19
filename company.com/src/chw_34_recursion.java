import java.util.Scanner;

public class chw_34_recursion {

    //    recursive function
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    //   itreive method
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //  itretive method
    static int factorial_itretive(int n) {
        int priduct = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                priduct *= i;
            }
            return priduct;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();


        System.out.println("factorial n = " + fact(n));  // method_1
        System.out.println("factorial n = " + factorial(n)); // method _2
        System.out.println("factorial n = " + factorial_itretive(n));  // method_3


        

    }
}


