package C3_Choose;

/**
 * 模拟抽牌，不包含大小王，显示大小和花色
 */
public class P24_CardPicker {
    public static void main(String[] args) {
        int sizeInt,typeInt;
        sizeInt=(int)(Math.random()*13+1);
        typeInt=(int)(Math.random()*4+1);

        System.out.print("The card you picked is ");
        switch (sizeInt){
            case 1:
                System.out.print("Ace ");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.print(sizeInt+" ");
                break;
            case 11:
                System.out.print("Jack ");
                break;
            case 12:
                System.out.print("Queen ");
                break;
            case 13:
                System.out.print("King ");
                break;
        }

        System.out.print("of ");
        switch (typeInt) {
            case 1:
                System.out.print("Clubs ");
                break;
            case 2:
                System.out.print("Diamonds ");
                break;
            case 3:
                System.out.print("Hearts ");
                break;
            case 4:
                System.out.print("Spades ");
                break;
        }
    }
}
