import java.util.Scanner;

public class StringLength {
    public static void main(String[] args)
    {
        //prompt the user for their fav sport
        System.out.printf("Enter your favourite sport: ");

        //store the user response in a variable
        Scanner keyboard = new Scanner(System.in);
        String favSport = keyboard.nextLine();

        //display how many letters are in the sport
        System.out.printf("Your favourite sport: %s has %d characters",
                                favSport, favSport.length());
    }

}
