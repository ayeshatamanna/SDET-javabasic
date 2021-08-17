//Write a program that takes a year from user and print whether that year is a leap year or not//
package If_else;
import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        System.out.println("Enter the year for check it is a leap year or not:");
        Scanner in= new Scanner(System.in);
        int year=in.nextInt();
        if(year%400==0){
            System.out.println("The year you entered is a leap year:" +year);
        }
        else if(year%100!=0 && year%4==0){
            System.out.println("The year you entered is a leap year:" +year);

        }
        else if (year%100!=0 && year%400==0)
        {
            System.out.println("The year you entered is not a leap year:" +year);
        }
        else{
            System.out.println("The year you entered is not a leap year:" +year);
        }


    }
}

