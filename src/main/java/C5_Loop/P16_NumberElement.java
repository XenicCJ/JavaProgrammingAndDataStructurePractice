package C5_Loop;

import java.util.Scanner;

/**
 * 输出数字的因子
 */
public class P16_NumberElement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        int element=2;

        System.out.print("Enter a number: ");
        number=input.nextInt();

        while(number>1){
            if(number%element==0){
                number/=element;
                if(number<=1){
                    System.out.print(element);
                }else{
                    System.out.print(element+", ");
                }
            }else {
                element+=1;
            }
        }
    }
}
