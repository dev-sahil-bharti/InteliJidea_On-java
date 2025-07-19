import java.util.Scanner;

public class conditions_pc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // problem 1:
//        int a = 10;
//        if (a == 11) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }

//        problem 2:
//        int num1, num2, num3;
//        System.out.println("Subject 1: ");
//        int num1 = sc.nextInt();
//
//        System.out.println("Subject 2: ");
//        int num2 = sc.nextInt();
//
//        System.out.println("Subject 3: ");
//        int num3 = sc.nextInt();
//        int total_marks = num1 + num2 + num3;
//        float avrage = total_marks / 3.0f;
//
//        if (num1 >= 33 && num2 >= 33 && num3 >= 33 && avrage >= 40) {
//            System.out.println("Congruculations! you are pass");
//        } else {
//            System.out.println("Sorry!  you are fail");
//        }

//        Problem 3:

//        System.out.println("Enter the your income ");
//        double income = sc.nextDouble();
//
//        double tax = 0;
//        if (income <= 2.5) {
//            tax = 0;
//        } else if (income <= 5.0) {
//            tax = (income - 2.5) * 0.05;
//        } else if (income <= 10.0) {
//            tax = (2.5 * 0.05) + (income - 5.0) * 0.20;
//        } else {
//            tax = (2.5 * 0.05) + (5.0 * 0.20) + (income - 10.0) * 0.30;
//        }
//        System.out.printf("Toale tax be paid %.2f", tax * 100000);

//
//        Problem 4:

//        System.out.println("Enter the day code: ");
//        int days = sc.nextInt();
//        switch (days) {
//            case 1 -> System.out.println("mo");
//            case 2 -> System.out.println("tu");
//            case 3 -> System.out.println("we");
//            case 4 -> System.out.println("th");
//            case 5 -> System.out.println("fr");
//            case 6 -> System.out.println("st"); // Consider changing "st" to "sa" for Saturday
//            case 7 -> System.out.println("su");
//            default -> System.out.println("Invalid day code! Please enter a number between 1 and 7.");
//        }



//        Problem 5:
//        System.out.println("Enter the year ");
//        int year = sc.nextInt();

//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//            System.out.printf("%d is  leep year", year);
//        }else{
//            System.out.printf("%d is not leep year", year);
//        }
//
//
//        Problem 6:
//        System.out.println("Enter your Web url: ");
//        String url = sc.nextLine().toLowerCase();
//
//        if(url.endsWith(".com")){
//            System.out.println("Commercial Website");
//        }
//        else if(url.endsWith(".org")){
//            System.out.println("Organizational Website ");
//        }
//        else if(url.endsWith(".in")){
//            System.out.println("Indian Website");
//        }
//        else{
//            System.out.println("Unknowan type of Website");
//        }

    }

}
