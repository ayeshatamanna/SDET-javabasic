package Basic_java;
import java.util.Scanner;
public class Problem_5 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Input a= ");
        int a=in.nextInt();
        System.out.print("Input b= ");
        int b=in.nextInt();
        System.out.print("Input c= ");
        int c=in.nextInt();
        System.out.println("sum="+(a+b+c));
        System.out.println("average="+(a+b+c/3));
    }
}
