package C5_Loop;

/**
 * 打印一些数字图案
 */
public class P18_PrintPatterns {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        for(int i=6;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        for(int i=1;i<=6;i++){
            for(int j=6-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=1;i<=6;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=7-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
