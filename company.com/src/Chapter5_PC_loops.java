import java.util.Scanner;

public class Chapter5_PC_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the Number: ");
//        int num = sc.nextInt();
//
//    Problem 1:
//        for (int i = rows; i >= 0; i--)
//            {
//            for (int j = 0; j <= i; j++)
//            {
//                System.out.print("*");
//            }
//                System.out.println();
//        }

//        Problem 2:
//        for (int i = 2; i <= num; i++) {
//            if (i % 2 == 0) {
//                System.out.printf("The result is: %d", i);
//            }
//        }

//        Problem 3:
//        System.out.println("Multipulication table is:");
//        for (int i = 1; i <= 10; i++) {
//
//            System.out.printf("%d = %d x %d\n", num, i, num *i);
//        }

//        Problem 4:
//        int n = sc.nextInt();
//
//        System.out.println("Reverse multiplication table: ");
//        for (int i = 10; i >= 1; i--){
//            System.out.printf("%d x %d = %d\n", i, n, n*i);
//        }

//        Problem 5:
//        System.out.println("Enter the Number: ");
//        int num = sc.nextInt();
//        long fact = 1;
//        if (num == 0) {
//            System.out.println("factorial dose not exist for negative number: ");
//        } else {
//            for (int i = 1; i <= num; i++) {
//                fact = fact * i;
//            }
//            System.out.println("Factorial of " + num + " is: " + fact);
//        }

//        Problem 6:
//        int num = sc.nextInt();
//        int i = 1;
//        long fact = 1;
//        if (num == 0) {
//            System.out.println("factorial dose not exist for negative number: ");
//        } else {
//            while (i <= num) {
//                fact = fact * i;
//                i++;
//            }
//            System.out.println("factorial of " + num + " is: " + fact);
//        }

//        Problem 7:
//        int num = 5;
//        int i = 0;
//
//        while (i < num) {
//            int space = 0;
//            while (space < i) {
//                System.out.print(" ");
//                space++;
//            }
//            int star = 0;
//            while (star < num - i) {
//                System.out.print("*");
//                star++;
//            }
//            System.out.println();
//            i++;
//        }

//        Problem 9

        int num = 8;
        long sum = 0;
        System.out.print("table : ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ", num * i);
        }

        for (int i = 1; i <= 10; i++) {
            sum += num * i;
        }
        System.out.printf("\nthe sum is: %d", sum);
    }
}
