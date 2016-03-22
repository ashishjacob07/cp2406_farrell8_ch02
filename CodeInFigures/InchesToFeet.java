/**
 * Created by jc337162 on 22/03/2016.
 */
public class InchesToFeet
{
    public static void main(String[] args)
        {
            final int in_ft = 12;
            int inch = 1;
            int feet;
            int dotInch;
            feet = inch/in_ft;
            dotInch = inch % in_ft;
            System.out.println(inch + " inches is " + feet + " feet and " + dotInch + " inches");
        }
}
