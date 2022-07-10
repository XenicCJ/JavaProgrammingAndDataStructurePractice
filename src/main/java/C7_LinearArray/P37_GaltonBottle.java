package C7_LinearArray;

import java.util.Scanner;

/**
 * Galton Bottle
 */
public class P37_GaltonBottle {
    static Scanner input=new Scanner(System.in);

    /**
     * the main entrance of game
     */
    public static void game(){
        int ballAmount;
        int slotAmount;
        int[] slots;
        //get input
        System.out.print("Enter the number of balls to drop: ");
        ballAmount=input.nextInt();
        System.out.print("Enter the number of slots in bean machine: ");
        slotAmount=input.nextInt();
        slots=new int[slotAmount];
        //play game
        for(int i=0;i<ballAmount;i++){
            oneGame(slots);
        }
        //show result
        showResult(slots);
    }

    /**
     * the main entrance of game
     */
    public static void autoGame(){
        int ballAmount=10;
        int slotAmount=5;
        int[] slots;
        slots=new int[slotAmount];
        //play game
        for(int i=0;i<ballAmount;i++){
            oneGame(slots);
        }
        //show result
        showResult(slots);
    }

    /**
     * play game once
     * @param slots
     */
    public static void oneGame(int[] slots){
        int slotAmount=slots.length;
        int pos=oneGameRoute(slotAmount);
        if(slotAmount%2==1){
            slots[slotAmount/2+pos]++;
        }else {
            if(pos>0){
                slots[slotAmount/2-1+pos]++;
            }else{
                slots[slotAmount/2+pos]++;
            }
        }
    }

    /**
     * simulate ball's route in one game, and print the route
     * @param slotAmount
     * @return R-L
     */
    public static int oneGameRoute(int slotAmount){
        String routeStr="";
        int pos=0;
        for(int i=0;i<slotAmount-1;i++){
            double randNum=Math.random();
            if(randNum<0.5){
                routeStr+="L";
                pos--;
            }else{
                routeStr+="R";
                pos++;
            }
        }
        System.out.println(routeStr);
        if(pos>0){
            return (pos+1)/2;
        }else if(pos<0){
            return (pos-1)/2;
        }else
            return 0;
    }

    public static void showResult(int[] slots){
        int max=0;
        for(int i=0;i<slots.length;i++){
            if(slots[i]>max){
                max=slots[i];
            }
        }
        for(int i=max;i>0;i--){
            for(int j=0;j<slots.length;j++){
                if(slots[j]>=i){
                    System.out.print("0");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        game();
        //autoGame();
    }
}
