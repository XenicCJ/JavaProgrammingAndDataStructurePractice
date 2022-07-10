package C6_Function;

/**
 * gamble with two dices, if sum is 2,3,12 you lose, if sum is 7 or 11 you win.
 * if sum is 4,5,6,8,9,10, record this sum, dice over and over again until sum is the record or 7, if 7, you lose, if record you win
 * run this game 10000 times, show how many times we won
 */
public class P30_DoubleDiceGamble {
    /**
     * play game once
     */
    public static boolean theGame(){
        int points=twoDicesRoll();
        return firstGameSplit(points);
    }

    public static boolean firstGameSplit(int points){
        switch (points){
            case 2:
            case 3:
            case 12:
                printLose();
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                return otherPointsGame(points);
            case 7:
            case 11:
                printWin();
                return true;
        }
        return true;
    }
    /**
     * do other points game once
     * @param record
     */
    public static boolean otherPointsGame(int record){
        System.out.println("Point is "+record);
        int points=0;
        while(true){
            points=twoDicesRoll();
            if(points==7){
                printLose();
                return false;
            }
            if(points==record){
                printWin();
                return true;
            }
        }
    }

    public static void printWin(){
        System.out.println("You win");
    }

    public static void printLose(){
        System.out.println("You lose");
    }
    /**
     * roll two dices once
     * @return
     */
    public static int twoDicesRoll(){
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);

        System.out.println("You rolled "+dice1+" + "+dice2+" = "+(dice1+dice2));

        return dice1+dice2;
    }

    public static void main(String[] args) {
        int winTimes=0;
        for(int i=0;i<100000;i++){
            System.out.println("Game "+(i+1)+" start");
            if(theGame()){
                winTimes++;
            }
        }
        System.out.println("Win time: "+winTimes);
    }

}
