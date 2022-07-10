package C4_MathFunctionCharString;

import java.util.Scanner;

/**
 * 猜测生日
 */
public class P10_BirthdayGuess {
    public static void main(String[] args) {
        String set1=
                "1 3 5 7\n9 11 13 15\n17 19 21 23\n25 27 29 31";
        String set2=
                "2 3 6 7\n10 11 14 15\n18 19 22 23\n26 27 30 31";
        String set3=
                "4 5 6 7\n12 13 14 15\n20 21 22 23\n28 29 30 31";
        String set4=
                "8 9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31";
        String set5=
                "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31";

        char answer;
        String str;
        int birthday=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Is your birthday in set1?");
        System.out.println(set1);
        System.out.println("Enter Y if yes, enter N if no");
        str=input.next();
        if(str.charAt(0)=='Y'){
            birthday+=1;
        }

        System.out.println("Is your birthday in set2?");
        System.out.println(set2);
        System.out.println("Enter Y if yes, enter N if no");
        str=input.next();
        if(str.charAt(0)=='Y'){
            birthday+=2;
        }

        System.out.println("Is your birthday in set3?");
        System.out.println(set3);
        System.out.println("Enter Y if yes, enter N if no");
        str=input.next();
        if(str.charAt(0)=='Y'){
            birthday+=4;
        }

        System.out.println("Is your birthday in set4?");
        System.out.println(set4);
        System.out.println("Enter Y if yes, enter N if no");
        str=input.next();
        if(str.charAt(0)=='Y'){
            birthday+=8;
        }

        System.out.println("Is your birthday in set5?");
        System.out.println(set5);
        System.out.println("Enter Y if yes, enter N if no");
        str=input.next();
        if(str.charAt(0)=='Y'){
            birthday+=16;
        }

        System.out.println("Your birthday is: "+birthday);
    }
}
