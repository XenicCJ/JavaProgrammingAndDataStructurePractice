package C6_Function;

/**
 *  show top 100 numbers that are both palindrome number and prime number
 */
public class P26_PalindromePrime {
    /**
     * test if a number is a prime number
     * @param n
     * @return
     */
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    /**
     * test if a string is palindrome
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str){
        int length=str.length();
        char[] chars=str.toCharArray();
        for(int i=0;i<length;i++){
            if(chars[i]!=chars[length-1-i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int serial=0;
        int number=2;
        int lineNo=0;
        while(serial<100){
            if(isPalindrome(number+"")&&isPrime(number)){
                serial++;
                System.out.print(number+" ");

                lineNo++;
                if(lineNo>=10){
                    lineNo=0;
                    System.out.println();
                }
            }
            number++;
        }
    }
}
