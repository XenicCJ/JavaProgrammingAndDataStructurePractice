package C10_ObjectOrientedThink;

import java.util.Stack;

/**
 * show primes reversely
 */
public class P6_ShowPrimes {
    public static void showPrimeReversely(int num){
        Stack<Integer> stack=getPrimeStack(num);
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static Stack<Integer> getPrimeStack(int num){
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=2;i<=num;i++){
            if(isPrime(i)){
                stack.push(i);
            }
        }
        return stack;
    }

    public static boolean isPrime(int num){
        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        showPrimeReversely(120);
    }
}
