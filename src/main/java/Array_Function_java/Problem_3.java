package Array_Function_java;

public class Problem_3 {

    public static void main(String[] args) {

        int [] duplicateValArr = new int [] {10, 5, 2, 3, 2, 7, 7, 15, 10};
        for(int m = 0; m < duplicateValArr.length; m++) {
            for(int n = m + 1; n < duplicateValArr.length; n++) {
                if(duplicateValArr[m] == duplicateValArr[n])
                    System.out.println(duplicateValArr[m]);

            }
        }
    }
}
