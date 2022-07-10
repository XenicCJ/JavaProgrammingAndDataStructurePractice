package C6_Function;

import java.util.Scanner;

/**
 * show a pattern with function
 */
public class P6_ShowPattern {
    public static void displayPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number=input.nextInt();

        displayPattern(number);
    }
}
