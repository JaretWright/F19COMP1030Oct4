import java.util.Scanner;

public class Title {
    public static void main(String[] args)
    {
        //prompt the user for their last name
        System.out.printf("Enter your last name: ");
        Scanner keyboard = new Scanner(System.in);
        String lastName = keyboard.nextLine();

        //prompt the user for male or female
        System.out.printf("Enter if you are male or female: ");
        String gender = keyboard.nextLine();

        //display the proper title with the last name
        System.out.printf("Hi %s %s", getTitle(gender), lastName);
    }

    /**
     * This method will return "Mr." or "Ms." depending on
     * if the argument is male or female
     */
    public static String getTitle(String gender)
    {
        gender = gender.trim();
        if (gender.equalsIgnoreCase("male"))
            return "Mr.";
        else if (gender.equalsIgnoreCase("female"))
            return "Ms.";
        else
            return "";
    }
}
