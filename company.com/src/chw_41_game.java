import java.util.Random;
import java.util.Scanner;

public class chw_41_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Rock, Paper and Scissor Game");
        System.out.println("1- Rock\n2- Paper\n3- Scissors\n");
        System.out.print("Enter your choice: ");
        int user = sc.nextInt();
        if (user < 1 || user > 3) {
            System.out.println("invalid input (1,2,3) only accepted!!");
            return;
        }

        int computer = rand.nextInt(3) + 1;
        String[] choice = {"Rock", "Paper", "Scissor"};
        System.out.println("your choice" + choice[user - 1]);
        System.out.println("Computer choice: " + choice [computer - 1]);

        if (user == computer) {
            System.out.println("match is drow!");
        } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 || computer == 2)) {
            System.out.println("you win!!");
        } else {
            System.out.println("You lose !!");
        }
    }
}
