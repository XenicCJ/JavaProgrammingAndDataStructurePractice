package C4_MathFunctionCharString;

import java.util.Scanner;

/**
 * 输入两个字符，输出对应的专业和年级
 */
public class P18_MajorAndGrade {
    public static void main(String[] args) {
        String str,major="",grade="";
        boolean isValidInput=true;

        Scanner input=new Scanner(System.in);

        System.out.print("Enter two characters: ");
        str=input.next().trim();

        if(str.length()!=2){
            System.out.println("Invalid Input.");
        }else {
            switch (str.charAt(0)){
                case 'M':
                    major="Mathematics";
                    break;
                case 'C':
                    major="Computer Science";
                    break;
                case 'I':
                    major="Information Technology";
                    break;
                default:
                    System.out.println("Invalid Input.");
                    isValidInput=false;
            }
            switch (str.charAt(1)){
                case '1':
                    grade="Freshman";
                    break;
                case '2':
                    grade="Sophomore";
                    break;
                case '3':
                    grade="Junior";
                    break;
                case '4':
                    grade="Senior";
                    break;
                default:
                    System.out.println("Invalid Input.");
                    isValidInput=false;
            }
            if(isValidInput){
                System.out.println(major+" "+grade);
            }
        }


    }
}
