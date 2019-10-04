import java.security.SecureRandom;

public class Dice {

    //these are instance variables - they should always be private
    private int numberOfSides, faceValue;

    /**
     * This is a constructor, it takes the # of sides as an
     * argument.  Valid Dice have 4->120
     */
    public Dice(int numberOfSides)
    {
        if (numberOfSides >= 4 && numberOfSides <= 120)
            this.numberOfSides = numberOfSides;
        else
            throw new IllegalArgumentException("Dice must have 4-120 sides");
        rollDice();
    }

    /**
     * This method will simulate rolling the dice and set the
     * faceValue with a random number
     */
    public int rollDice()
    {
        SecureRandom randomNumberGenerator = new SecureRandom();
        faceValue=randomNumberGenerator.nextInt(numberOfSides)+1;
        return faceValue;
    }

    
}
