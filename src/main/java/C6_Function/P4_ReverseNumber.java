package C6_Function;

import java.util.Scanner;

/**
 * show an integer reversely
 */
public class P4_ReverseNumber {
    public static void reverse(int number){
        String numberStr=""+number;
        char[] numberCharArray=numberStr.toCharArray();
        for(int i=0;i<numberStr.length()/2;i++){
            char c=numberCharArray[i];
            numberCharArray[i]=numberCharArray[numberStr.length()-1-i];
            numberCharArray[numberStr.length()-1-i]=c;
        }
        numberStr=String.valueOf(numberCharArray);
        System.out.println(numberStr);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number=input.nextInt();

        reverse(number);
    }
}
