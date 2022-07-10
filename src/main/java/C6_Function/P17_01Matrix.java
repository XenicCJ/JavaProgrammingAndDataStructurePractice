package C6_Function;

import java.util.Scanner;

/**
 * display a n*n matrix depend on user's input
 */
public class P17_01Matrix {
    public static void showMatrix(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(Math.round(Math.random())+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number=input.nextInt();

        showMatrix(number);
    }
}
