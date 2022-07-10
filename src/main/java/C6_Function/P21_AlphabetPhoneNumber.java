package C6_Function;

import java.util.Scanner;

/**
 * translate phone number shows with alphabets to numbers
 */
public class P21_AlphabetPhoneNumber {
    public static void translatePhoneNumber(String phoneNumber){
        phoneNumber=phoneNumber.toLowerCase();
        char[] phoneNumberCharArray=phoneNumber.toCharArray();
        int length=phoneNumber.length();
        for (int i=0;i<length;i++) {
            phoneNumberCharArray[i]=(char)(alphabetToNumber(phoneNumberCharArray[i])+'0');
        }
        phoneNumber=String.copyValueOf(phoneNumberCharArray);
        System.out.println(phoneNumber);
    }

    /**
     * translate lowercase alphabet to number
     * @param c
     * @return
     */
    public static int alphabetToNumber(char c){
        switch (c){
            case 'a':
            case 'b':
            case 'c':
                return 2;
            case 'd':
            case 'e':
            case 'f':
                return 3;
            case 'g':
            case 'h':
            case 'i':
                return 4;
            case 'j':
            case 'k':
            case 'l':
                return 5;
            case 'm':
            case 'n':
            case 'o':
                return 6;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                return 7;
            case 't':
            case 'u':
            case 'v':
                return 8;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return 9;
            default:
                return 1;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String phoneNumber;

        System.out.print("Enter a phone number: ");
        phoneNumber=input.nextLine();

        translatePhoneNumber(phoneNumber);
    }
}
