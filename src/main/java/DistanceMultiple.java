// NAME                 :   Conner Chan
// GROUP                :   APCSA
// LAST MODIFIED        :   9/16/25
// PROBLEM ID           :   2.23
// PROBLEM DESCRIPTION  :   Have the User input 2 cords, then output a result
// SOURCES USED         :   AP CS textbook
// PEOPLE I HELPED      :   Michael M
// I RECEIVED HELP FROM :   Michael M
import java.util.Scanner;
public class DistanceMultiple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
// Allows java to ignore ()
        sc.useDelimiter("[\\s,()]+");
// Declares variables
        double answer, x1, y1;
// Runs the program 2 times
        for(int p = 0; p < 3; p++)
        {
// Prompts users for the numbers
            System.out.println("input cords in (x,y):");
            int x = sc.nextInt();
            int y = sc.nextInt();
// Tells the user what is x and what is y
            System.out.println("x = " + x + ", y =" + y);
// Repeats last part
            System.out.println("input cords in (x,y):");
            sc.useDelimiter("[(),\\s]+");
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println("x = " + x2 + ", y =" + y2);
// Runs calculations
            x1 = (x - x2);
            y1 = (y - y2);
            answer = Math.sqrt((x1 * x1) + (y1 * y1));
// Outputs answer
            System.out.println("The distance between the two points is " + answer);
        }
    }
}




