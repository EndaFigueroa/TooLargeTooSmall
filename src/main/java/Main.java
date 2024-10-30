import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rando = random.nextInt(100);
        int isIt = 0;
        boolean win = false;
        int guesses = 0;

        System.out.println("Welcome! Please enter a number between 1 + 100!");
        do {
            isIt = scanner.nextInt();
            if (isIt==rando) { win=true;
                System.out.println("You win! You did it in " + guesses + " guesses!");
            } else {
                if (isIt > rando) {
                    System.out.println("Too large! Try again");
                    guesses += 1;
                } else {
                    System.out.println("Too small! Try again");
                    guesses += 1;
                }
            }
        } while (win == false);
    }
}
        //int rando = random number gen;
        //int isIt = user input;
        //int guesses = guesses so far;

        //welcome scanner output with inst
        //promt to input
        //if true/false loop. If true, end loop print win
        //if false continue loop and add to guesses




