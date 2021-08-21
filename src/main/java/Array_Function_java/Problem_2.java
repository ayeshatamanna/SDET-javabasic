package Array_Function_java;
import java.util.Scanner;

public class Problem_2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int length = 0;
            int numbers[] = null;

            System.out.print("What is the length of the array: ");
            length = scan.nextInt();

            numbers = new int[length];

            System.out.println("Enter array elements: ");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scan.nextInt();
            }

            System.out.println("The second largest element  is = "
                    + secondLargest(numbers));

            scan.close();
        }

        public static int secondLargest(int[] arr) {
            int largest = 0;
            int secondLargest = 0;
            largest = arr[0];
            secondLargest = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (largest < arr[i]) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if(secondLargest < arr[i]) {
                    secondLargest = arr[i];
                }
            }

            return secondLargest;
        }

    }


