//Take a number as input from the user. Now write a program to show table of the given numbers//

package If_else;
import java.util.Scanner;
public class Problem_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num1 = in.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(num1 + " x " + (i+1) + " = " +
                    (num1 * (i+1)));
        }
    }
}