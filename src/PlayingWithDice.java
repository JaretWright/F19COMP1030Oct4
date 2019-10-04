import java.util.Scanner;

public class PlayingWithDice {
    public static void main(String[] args)
    {
        Dice die1 = new Dice(6);
        Dice die2 = new Dice(6);

        System.out.printf("die1: %s     die2: %s %n", die1, die2);
        die1.rollDice();
        System.out.printf("die1: %s     die2: %s %n", die1, die2);
        die2.rollDice();
        System.out.printf("die1: %s     die2: %s %n", die1, die2);

        int numOfSides=0;
        Dice die3;

        while (numOfSides==0)
        {
            try {
                System.out.printf("Enter how many sides you want on the Dice: ");
                Scanner keyboard = new Scanner(System.in);
                numOfSides = keyboard.nextInt();
                die3 = new Dice(numOfSides);
                System.out.printf("die1: %s     die2: %s    die3: %s%n"
                        , die1, die2, die3);
            } catch (IllegalArgumentException e) {
                System.out.printf("%s%n", e.getMessage());
                numOfSides=0;
            }
        }


    }
}
