public class Chw_35_prectice {

    static void mulTable(int n) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.printf("%d x %d = %d \n", n, i, result);
        }
    }

    //print starPattern itretive method
    static void starPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //print starPattern recursive method
    static void revStarPattern(int n) {
        if (n > 0) {
            starPattern(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static int sumNeturalNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println("Natural Number sum is: " + sum);
        return sum;
    }

    static void starPatternRev(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void reverseLeftTriangle(int n) {
        if (n == 0) return;

        // Print n stars
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Recursive call for next row with n-1 stars
        reverseLeftTriangle(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void printFiboncci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < n; i++) {
            int nextt = a + b;
            System.out.print(nextt + " ");
            a = b;
            b = nextt;
        }
    }

    static double findAvrage(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) +32;
    }

    public static void main(String[] args) {

//        Problem 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int a = sc.nextInt();
//        System.out.println("Multiplication Table is:");
//        mulTable(a);

//        Problem 2
//        int rows = 5;
//        starPattern(5);

//        Problem 3
//        int n = 10;
//        sumNeturalNumber(n);

//        Problem 4
//        int rowss= 5;
//        starPatternRev(rowss);

//        Problem 5
//        int n = 7;
//        System.out.print("fibonacci series:  ");
//        printFiboncci(n);

//        int n2 = 5;
//        System.out.print("\nPrint the indexing base fibonacci series element:  ");
//        System.out.print(fibonacci(5));

//        Problem 6
//        int []numbers = {10,22,33,45,67,55};
//        System.out.println("the avrage of: "+findAvrage(10,20,30));

//        Problem 7
//        reverseLeftTriangle(5);

//        Problem 8
//        revStarPattern(5);

//        Problem 9
        double c = 37;
        double f = celsiusToFahrenheit(c);
        System.out.println(c+ "C = " + f + "F" );
    }

}
