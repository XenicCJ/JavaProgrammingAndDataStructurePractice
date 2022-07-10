package C8_MultiDemensionalArray;

import java.util.Scanner;

/**
 * game of TicTacToe
 */
public class P9_TicTacToe {
    static Scanner input=new Scanner(System.in);

    /**
     * body of game, play game once
     */
    public static void game(){
        //initialize game data storage, 0 for empty, 1 for O, 2 for X
        int[][] panelData=new int[3][3];
        //record player O or player X moves
        int round=1;
        //record result
        int result;
        int row;
        int column;
        boolean finish=false;

        do {
            //show game panel
            printPanel(panelData);
            //player choose where to move and change round
            move(panelData,round);
            round=changeRound(round);
            //check if player win the game
            result=ifFinish(panelData);
            finish=finishConditionDealer(result);
            if(finish){
                printPanel(panelData);
            }
        }while(!finish);

    }

    /**
     * print the game panel
     * @param panelData
     */
    public static void printPanel(int[][] panelData){
        System.out.println(getHrString());
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("|"+getCellString(panelData[i][j]));
            }
            System.out.println("|");
            System.out.println(getHrString());
        }
    }

    /**
     * get a string that shows a cell of the panel
     * @param data
     * @return
     */
    public static String getCellString(int data){
        if(data==0)
            return "     ";
        if(data==1)
            return "  O  ";
        if (data==2)
            return "  X  ";
        return null;
    }

    /**
     * get a string that shows a horizontal line
     * @return
     */
    public static String getHrString(){
        return "-------------------";
    }

    /**
     * make a move ,value is 1 or 2
     * @param data
     * @param value
     */
    public static void move(int[][] data,int value){
        char c='0';
        if(value==1){
            c='O';
        }else if(value==2){
            c='X';
        }
        System.out.print("Enter a row and column (0,1 or 2) for player "+c+": ");
        int row=input.nextInt();
        int column=input.nextInt();
        data[row][column]=value;
    }

    public static int changeRound(int round){
        if(round==1){
            return 2;
        }
        if(round==2){
            return 1;
        }
        return 0;
    }

    /**
     * test if game finishes, return -1 or 0 or 1 or 2
     * @param data
     * @return -1 for tie, 0 for not finish, 1 for O wins, 2 for X wins
     */
    public static int ifFinish(int[][] data){
        //test if win by line or row
        for(int i=0;i<3;i++){
            if(data[i][0]!=0&&data[i][0]==data[i][1]&&data[i][0]==data[i][2]){
                return data[i][0];
            }else if(data[0][i]!=0&&data[0][i]==data[1][i]&&data[0][i]==data[2][i]){
                return data[0][i];
            }
        }
        //text if win by diagonal line
        if(data[1][1]!=0&&data[0][0]==data[1][1]&&data[2][2]==data[1][1] || data[1][1]!=0&&data[2][0]==data[1][1]&&data[1][1]==data[0][2]){
            return data[1][1];
        }

        //test if game tied
        boolean tie=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(data[i][j]==0){
                    tie=false;
                    break;
                }
            }
            if(!tie){
                break;
            }
        }

        //if tie return -1
        if(tie){
            return -1;
        }

        //no one win, no tie, return 0
        return 0;
    }

    public static boolean finishConditionDealer(int result){
        if(result==-1){
            System.out.println("Game Even");
            return true;
        }else if(result==1){
            System.out.println("Player O wins");
            return true;
        }else if(result==2){
            System.out.println("Player X wins");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        game();
    }
}
