import java.util.Random;
import java.util.Scanner;

class game {
    public int number;
    public int noOfGasses = 0;
    public int inputNumber;

    public int getNoOfGasses() {
        return noOfGasses;
    }

    public void setNoOfGasses(int noOfGasses) {
        this.noOfGasses = noOfGasses;
    }

    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void userInput() {
        System.out.println("Gasse the Number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean iscarrectNumber() {
        noOfGasses++;
        if (inputNumber == number) {
            System.out.format("yes you gasse it right, it was %d\n you gassed it in %d attempts", number, noOfGasses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("to low....");
        } else if (inputNumber > number) {
            System.out.println("to high....");
        }
        {
            return false;
        }
    }
}

public class cwh_50_exercise03_solve {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b) {
            g.userInput();
            g.iscarrectNumber();
            b = g.iscarrectNumber();
        }
    }
}
