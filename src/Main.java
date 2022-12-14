/**
 * Activity Results takes numbers from a file and finds the
 * average of low-high days.
 * @author Scylla
 * @date 9/14/2022
 * Section 1437.200
 */

import java.io.*;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("steps.txt");
        PrintWriter outfile = new PrintWriter("activityResults.txt");
        Scanner infile = new Scanner(file);
        int placeHolder = 0; 
        int highCount = 0; 
        int medCount = 0;
        int lowCount = 0;
        float highest;
        float lowest;
        float middle;
     

        
        while (infile.hasNext())
        {
            placeHolder = infile.nextInt();

            if (placeHolder >= 10000)
            {
                highCount++;
                //System.out.println(highCount);
            }
            else if (placeHolder >= 5000 && placeHolder <= 9999)
            {
                medCount++;
                //System.out.println(medCount);
            }
            else if (placeHolder < 5000)
            {
                lowCount++;
                //System.out.println(lowCount);
            }

        }

        lowest = ((float)lowCount / 365) * 100;

        middle = ((float)medCount / 365) * 100;

        highest = ((float)highCount / 365) * 100;

        outfile.print("***Actvitiy Results***\n\n");
        outfile.printf("High Activity Days: " + highCount + ", %3.2f%%\n", highest);
        outfile.printf("Medium Activity Days: " + medCount + ", %3.2f%%\n", middle);
        outfile.printf("High Activity Days: " + lowCount + ", %3.2f%%\n", lowest);
        



        infile.close();
        outfile.close();
    }    
}
