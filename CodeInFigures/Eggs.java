/**
 * Created by jc337162 on 22/03/2016.
 */

import java.util.Scanner;
public class Eggs
{
    public static void main(String[] args)
    {
        final double dozenprize = 3.25;
        final double singleprize = 0.45;
        int num_eggs;
        int dozen_egg;
        int loose_egg;
        double final_prize;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of eggs: >> ");
        num_eggs = input.nextInt();
        dozen_egg = num_eggs / 12;
        loose_egg = num_eggs % 12;
        final_prize = (dozen_egg * dozenprize) + (loose_egg * singleprize);
        System.out.println("You ordered " + num_eggs + " eggs. " +
                "That's " + dozen_egg + " dozen at $3.25 per dozen and " + loose_egg
                + " loose eggs at 45 cents each for a total of $" + final_prize);
    }
}