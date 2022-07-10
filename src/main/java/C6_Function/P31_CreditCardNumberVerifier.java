package C6_Function;

import java.util.Scanner;

/**
 * verify credit card number
 * head of credit number: 4 for Visa, 5 for Master, 37 for American Express, 6 for Discover
 * use Luhn test or Mod 10 test
 * test case: 4388576018410707, 4388576018402626
 */
public class P31_CreditCardNumberVerifier {
    /**
     * verify if card number is valid
     * @param cardNumberStr
     * @return
     */
    public static boolean valid(String cardNumberStr){
        //test if cardNumberStr consist only numbers
        if(!ifConsistOfOnlyNumbers(cardNumberStr))
            return false;
        //test if cardNumberStr length valid
        if(!ifLengthValid(cardNumberStr))
            return false;
        //test if cardNumberStr head valid
        if(!ifHeadValid(cardNumberStr))
            return false;
        //test if cardNumberStr valid with Mod 10 test
        if(!ifMod10Valid(cardNumberStr))
            return false;
        return true;
    }

    /**
     * test if cardNumberStr consist only numbers
     * @param cardNumberStr
     * @return
     */
    public static boolean ifConsistOfOnlyNumbers(String cardNumberStr){
        char[] chars=cardNumberStr.toCharArray();
        for(int i=0;i<strLength(cardNumberStr);i++){
            if(chars[i]<'0'||chars[i]>'9'){
                return false;
            }
        }
        return true;
    }

    /**
     * test if cardNumberStr length valid
     * @param cardNumberStr
     * @return
     */
    public static boolean ifLengthValid(String cardNumberStr){
        int length=strLength(cardNumberStr);
        if(length<13||length>16)
            return false;
        return true;
    }

    /**
     * test if cardNumberStr head valid
     * @param cardNumberStr
     * @return
     */
    public static boolean ifHeadValid(String cardNumberStr){
        char charHead=cardNumberStr.charAt(0);
        String strHead=cardNumberStr.substring(0,2);
        if(charHead!='4'&&charHead!='5'&&charHead!='5'&&strHead.compareTo("37")!=0){
            return false;
        }
        return true;
    }

    /**
     * test if cardNumberStr valid with Mod 10 test
     * @param cardNumberStr
     * @return
     */
    public static boolean ifMod10Valid(String cardNumberStr){
        int sum=0;
        //get sum of even place doubled
        sum+=getReverseEvenDoubleSum(cardNumberStr);
        //get sum of odd place
        sum+=getReverseOddSum(cardNumberStr);
        //Mod 10 test
        if(sum%10==0)
            return true;
        else
            return false;
    }

    /**
     * get sum of even place doubled
     * @param cardNumberStr
     * @return
     */
    public static int getReverseEvenDoubleSum(String cardNumberStr){
        int sum=0;
        for(int i=2;i<=strLength(cardNumberStr);i+=2){
            sum+=getDigit(2*getReverseNumber(cardNumberStr,i));
        }
        return sum;
    }

    /**
     * get sum of odd place
     * @param cardNumberStr
     * @return
     */
    public static int getReverseOddSum(String cardNumberStr){
        int sum=0;
        for(int i=1;i<=strLength(cardNumberStr);i+=2){
            sum+=getReverseNumber(cardNumberStr,i);
        }
        return sum;
    }

    /**
     * get one digit in integer reversely, pos start from 1
     * @param cardNumberStr
     * @return
     */
    public static int getReverseNumber(String cardNumberStr,int pos){
        return cardNumberStr.charAt(strLength(cardNumberStr)-pos)-'0';
    }

    /**
     * return the digit if it's a single digit
     * otherwise return the sum of two digits
     * @param number
     * @return
     */
    public static int getDigit(int number){
        if(number<10)
            return number;
        else
            return number%10+number/10%10;
    }

    /**
     * get length of str
     * @param str
     * @return
     */
    public static int strLength(String str){
        return str.length();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String cardNumberStr;

        System.out.print("Enter a card number: ");
        cardNumberStr=input.nextLine();

        if(valid(cardNumberStr)){
            System.out.println(cardNumberStr+" is valid.");
        }else {
            System.out.println(cardNumberStr+" is invalid.");
        }
    }
}
