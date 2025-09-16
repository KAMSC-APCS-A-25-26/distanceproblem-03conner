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
        Scanner sc = new Scanner(System.in).useDelimiter("[\\s,()]+");
// Declares variables
        double answer, x, y;
// Runs the program 2 times
        for(int t = 0; t < 3; t++)
        {
// Prompts users for the numbers
            System.out.println("input cords in (x,y):");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
// Tells the user what is x and what is y
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
// Runs calculations
            x = (x2 - x1);
            y = (y2 - y1);
            answer = Math.sqrt((x * x) + (y * y));
// Outputs answer
            System.out.println(answer);
        }
    }
}




