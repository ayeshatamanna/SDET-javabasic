package Array_Function_java;
import java.util.Scanner;

public class Problem_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] mainArray = {10, 5, 2, 3, 2, 7, 7, 15, 10};  int user_inp = 0; int position_var = -1;

        System.out.print("Enter the desire value to find position : ");
        user_inp = scan.nextInt();

        int i = 0;
        while(i < mainArray.length) {
            if(mainArray[i] == user_inp) {
                position_var = i;
                break;
            }
            i++;
        }

        System.out.println("Position Found At : "+position_var);
    }
}
