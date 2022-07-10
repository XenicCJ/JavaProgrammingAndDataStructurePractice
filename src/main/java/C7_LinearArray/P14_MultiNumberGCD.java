package C7_LinearArray;

/**
 * program a function, shows gcd of all numbers
 */
public class P14_MultiNumberGCD {
    /**
     * shows gcd of all numbers, use division algorithm
     * @param numbers
     * @return int
     */
    public static int gcd(int... numbers){
        while(getOnlyPositivePosition(numbers)<0){
            divisionOnce(numbers);
        }
        return numbers[getOnlyPositivePosition(numbers)];
    }

    /**
     * test if there is only one positive number in array.
     * if yes, return position; if not, return -1
     * @param numbers
     * @return int
     */
    public static int getOnlyPositivePosition(int[] numbers){
        boolean ifFirstPositive=false;
        int firstPositivePosition=-1;
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]>0){
                if(ifFirstPositive){
                    return -1;
                }else{
                    ifFirstPositive=true;
                    firstPositivePosition=i;
                }
            }
        }
        return firstPositivePosition;
    }

    /**
     * do 1 round of division algorithm
     * @param numbers
     * @return void
     */
    public static void divisionOnce(int[] numbers){
        //get first positive number position, then get minimum positive number position
        int minNumberPosition=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                minNumberPosition=i;
                break;
            }
        }
        for(int i=minNumberPosition;i<numbers.length;i++){
            if(numbers[i]<numbers[minNumberPosition]&&numbers[i]!=0){
                minNumberPosition=i;
            }
        }
        //do division once
        for(int i=0;i<numbers.length;i++){
            if(i==minNumberPosition||numbers[i]==0)
                continue;
            numbers[i]%=numbers[minNumberPosition];
        }
    }

    public static void main(String[] args) {
        System.out.println("Start test");
        System.out.println(gcd(110,240,360,480,1000,1060));
    }
}
