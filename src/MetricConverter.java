import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);

       //Declaration of variables

        double meters = 0.0;
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;
        String trash = "";
        boolean done = true;

        //User input in meters

        System.out.print("Enter the measurement in meters: ");

        do
        {
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine(); //Clears new line buffer
                done = true;
            }

            else //Received invalid input need to read as a string
            {
                trash = in.nextLine();
                System.out.println("You said the measurement was: " + trash);
                System.out.println("That is invalid input try again!");
                done = false;

            }
        }while(!done);

        // Calculations for the print out screen

          feet = (meters * 3.28);
          miles = (meters / 1609);
          inches = (meters * 39.37);

          //Printing out the conversions.

        System.out.printf("%nThe measurement in feet is: %.2f", + feet);
        System.out.printf("%nThe measurement in miles is: %.2f",+ miles);
        System.out.printf("%nThe measurement in inches is: %.2f",+ inches);



    }
}