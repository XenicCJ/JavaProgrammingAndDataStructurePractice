package C8_MultiDemensionalArray;

import java.nio.file.LinkPermission;
import java.util.Scanner;

/**
 * connect four game
 */
public class P20_ConnectFour {
    private static Scanner input=new Scanner(System.in);
    private static final int ROWAMOUNT=6;
    private static final int COLUMNAMOUNT=7;
    private static final int WINLENGTH=4;

    /**
     * play game once
     */
    public static void game(){
        //0 for nothing, 1 for red, 2 for yellow
        int[][] panel=new int[ROWAMOUNT][COLUMNAMOUNT];
        int side=1;
        int result=0;

        do {
            //show panel
            printPanel(panel);
            //check if finish
            result=ifFinish(panel);
            if(result!=0){
                resultDealer(result);
                break;
            }
            //go move
            move(panel,side);
            //change side
            if(side==1){
                side=2;
            }
            else if(side==2){
                side=1;
            }
        }while(true);

    }

    /**
     * print game panel once
     * @param panel
     */
    public static void printPanel(int[][] panel){
        for(int i=0;i<ROWAMOUNT;i++){
            for(int j=0;j<COLUMNAMOUNT;j++){
                char c=' ';
                switch (panel[i][j]){
                    case 1:
                        c='R';
                        break;
                    case 2:
                        c='Y';
                        break;
                    default:
                        c=' ';
                }
                System.out.print("| "+c+" ");
            }
            System.out.println("|");
        }
        System.out.println("- 0 - 1 - 2 - 3 - 4 - 5 - 6 -");
    }

    /**
     * check if game finishes
     * @param data
     * @return -1 if even, 0 if not finish, 1 if red wins, 2 if yellow wins
     */
    public static int ifFinish(int[][] data){
        //check if anyone wins
        for(int i=0;i<ROWAMOUNT;i++){
            for(int j=0;j<COLUMNAMOUNT;j++){
                //if 0, continue
                if(data[i][j]==0)
                    continue;
                //row check
                if(j+WINLENGTH-1<COLUMNAMOUNT){
                    boolean win=true;
                    for(int k=0;k<WINLENGTH-1;k++){
                        if(data[i][j+k]!=data[i][j+k+1]){
                            win=false;
                            break;
                        }
                    }
                    if(win){
                        return data[i][j];
                    }
                }
                //column check
                if(i+WINLENGTH-1<ROWAMOUNT){
                    boolean win=true;
                    for(int k=0;k<WINLENGTH-1;k++){
                        if(data[i+k][j]!=data[i+k+1][j]){
                            win=false;
                            break;
                        }
                    }
                    if(win){
                        return data[i][j];
                    }
                }
                //diagonal
                if(j+WINLENGTH-1<COLUMNAMOUNT&&i+WINLENGTH-1<ROWAMOUNT){
                    boolean win=true;
                    for(int k=0;k<WINLENGTH-1;k++){
                        if(data[i+k][j+k]!=data[i+k+1][j+k+1]){
                            win=false;
                            break;
                        }
                    }
                    if(win){
                        return data[i][j];
                    }
                }
                //back-diagonal
                if(j+WINLENGTH-1<COLUMNAMOUNT&&i-WINLENGTH+1>=0){
                    boolean win=true;
                    for(int k=0;k<WINLENGTH-1;k++){
                        if(data[i-k][j+k]!=data[i-k-1][j+k+1]){
                            win=false;
                            break;
                        }
                    }
                    if(win){
                        return data[i][j];
                    }
                }
            }
        }
        //check if even or not finish
        for(int i=0;i<ROWAMOUNT;i++){
            for(int j=0;j<COLUMNAMOUNT;j++){
                if(data[i][j]==0)
                    return 0;
            }
        }
        return -1;
    }

    public static void resultDealer(int result){
        if(result==-1){
            System.out.println("Game even.");
        }
        if(result==1){
            System.out.println("The red player won.");
        }
        if(result==2){
            System.out.println("The yellow player won.");
        }
    }

    public static void move(int[][] data,int side){
        String sideStr="";
        if(side==1){
            sideStr="red";
        }
        if(side==2){
            sideStr="yellow";
        }

        boolean success=false;
        while(!success){
            System.out.print("Drop a "+sideStr+" disk at column(0-"+(COLUMNAMOUNT-1)+"): ");
            int column=input.nextInt();
            if(column<0||column>COLUMNAMOUNT-1){
                System.out.println("Invalid column.");
                continue;
            }
            for(int i=ROWAMOUNT-1;i>=0;i--){
                if(data[i][column]==0){
                    success=true;
                    data[i][column]=side;
                    break;
                }
            }
            if(success==false){
                System.out.println("Invalid column.");
            }
        }
    }

    public static void main(String[] args) {
        game();
    }
}
