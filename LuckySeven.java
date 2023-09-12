import java.util.Random;
import java.util.Scanner;

public class LuckySeven {
    public static void main(String[] args) {

        String answer = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me money, "
                + " how much do you want to play?");
        int money = scan.nextInt();
        do {

            // random is used
            Random rand = new Random();
            // Let´s define 3 random numbers
            // number between 1-10 that´s why we need +1
            int rNumb1 = rand.nextInt(10) + 1;
            int rNumb2 = rand.nextInt(10) + 1;
            int rNumb3 = rand.nextInt(10) + 1;
            System.out.println("Here is you´r numbers: " + rNumb1 + ", " + rNumb2 + ", " + rNumb3);
            money -= 1;
            // if you have three seven, you have jackpot!
            if (rNumb1 == 7 && rNumb2 == 7 && rNumb3 == 7) {
                System.out.println("JackPot! You win 7 money");
                money += 7;
                System.out.println("Now you have " + money + " money!");
            }
            // if you have 2 number seven, you have double win
            else if (rNumb1 == 7 && rNumb2 == 7 || rNumb3 == 7 && rNumb2 == 7
                    || rNumb3 == 7 && rNumb1 == 7) {
                System.out.println("Double Win! You win 5 money!");
                money += 5;
                System.out.println("Now you have " + money + " money!");
            }
            // if you have one seven, you win
            else if (rNumb1 == 7 || rNumb2 == 7 || rNumb3 == 7) {
                System.out.println("You Win 3 money!");
                money += 3;
                System.out.println("Now you have " + money + " money!");
            } else {
                System.out.println("You lose!");
                System.out.println("Now you have " + money + " money!");
            }
            System.out.println("Do you want to play again? y/n ");
            answer = scan.next();

            if (answer.equals("y") && money > 0) {
                System.out.println("New game star!");

            }
        } while (answer.equals("y") && money > 0);
        {

            if (answer.equals("n")) {
                System.out.println("Kiitos kun pelasit!");

            } else {
                System.out.println("Rahasi loppuivat!");
            }
        }
    }
}
