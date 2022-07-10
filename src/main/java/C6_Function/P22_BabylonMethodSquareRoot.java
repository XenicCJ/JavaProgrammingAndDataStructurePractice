package C6_Function;

/**
 * create a function using babylon method to calculate square root
 */
public class P22_BabylonMethodSquareRoot {
    public static double babylonSqrt(double number){
        if(number==0){
            return 0;
        }

        double lastGuess=number;
        double nextGuess=(lastGuess+number/lastGuess)/2;

        while(Math.abs(lastGuess-nextGuess)>0.00000001){
            lastGuess=nextGuess;
            nextGuess=(lastGuess+number/lastGuess)/2;
        }

        return nextGuess;
    }

    public static void main(String[] args) {
        System.out.println(babylonSqrt(0.01));
        System.out.println(babylonSqrt(0));
    }
}
