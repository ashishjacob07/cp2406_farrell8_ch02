import java.util.Scanner;

/**
 * Created by jc337162 on 22/03/2016.
 */
public class MinutesConversion
{
    public static void main(String[] args)
    {
        int minutes;
        double hours;
        double days;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: >> ");
        minutes = input.nextInt();
        hours = minutes/60;
        days = minutes/1440;
        System.out.println(minutes + " Minutes equals " + hours + " Hours and equals " + days + " Days");
    }
}
