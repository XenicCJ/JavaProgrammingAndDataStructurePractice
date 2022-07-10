package C5_Loop;

/**
 * 将1-10英里转换为公里表格
 */
public class P4_MileToKilometer {
    public static void main(String[] args) {
        System.out.println("\tMile\tKilometer\t");
        for(int i=1;i<11;i++){
            System.out.println("\t"+i+"\t"+i*1.609+"\t");
        }
    }
}
