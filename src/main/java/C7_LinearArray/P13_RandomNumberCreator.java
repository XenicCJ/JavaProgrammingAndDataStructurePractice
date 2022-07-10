package C7_LinearArray;

/**
 * program a function
 * return a random number between a and b, but can't be numbers send to the function
 */
public class P13_RandomNumberCreator {
    /**
     * return a random number between a and b(both include)
     * but can't be numbers send to the function
     * @param a
     * @param b
     * @param numbers
     * @return
     */
    public static int getRandom(int a,int b,int ... numbers){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }

        while(true){
            int randomNumber=(int)(Math.random()*(b-a+1)+a);
            boolean allow=true;
            for(int i=0;i<numbers.length;i++){
                if(randomNumber==numbers[i]){
                    allow=false;
                    break;
                }
            }
            if(allow){
                return randomNumber;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("A random number between 1 and 10, can't be 2,4,5,7: "+getRandom(10,1,2,4,5,7));
    }
}
