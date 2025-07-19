import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income in lakhs: ");
        double income = sc.nextDouble();

        double tax = 0;

        if (income <= 2.5) {
            tax = 0;
        } else if (income <= 5.0) {
            tax = (income - 2.5) * 0.05;
        } else if (income <= 10.0) {
            tax = (2.5 * 0.05) + (income - 5.0) * 0.20;
        } else {
            tax = (2.5 * 0.05) + (5.0 * 0.20) + (income - 10.0) * 0.30;
        }

        // Converting tax from lakhs to rupees
        System.out.printf("Total tax to be paid: ₹%.2f\n", tax * 100000);

        sc.close();
    }
}
