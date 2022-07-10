package C6_Function;

import java.util.Scanner;

/**
 * validate password
 */
public class P18_PasswordValidate {
    public static boolean ifPasswordValid(String password){
        //at least 8-charactor long
        if(password.length()<8)
            return false;
        //only and both contains alphabets and numbers
        int numbersAmount=0;
        int alphabetAmount=0;
        password=password.toLowerCase();
        for (char c:password.toCharArray()) {
            if(c>='0'&&c<='9'){
                numbersAmount++;
            }else if(c>='a'&&c<='z'){
                alphabetAmount++;
            }else{
                return false;
            }
        }
        //contains at least 2 numbers
        if(numbersAmount<2||alphabetAmount==0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String password;

        System.out.print("Enter a password: ");
        password=input.nextLine();

        if(ifPasswordValid(password)){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password");
        }
    }
}
