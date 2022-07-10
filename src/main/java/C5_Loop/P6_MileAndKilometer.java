package C5_Loop;

/**
 * 并排显示1-10英里与20-65千米转换的表格
 */
public class P6_MileAndKilometer {
    public static void main(String[] args) {
        System.out.println("\tMile\tKilometer\tKilometer\tMile\t");
        for(int i=1;i<11;i++){
            System.out.println("\t"+i+"\t"+i*1.609+"\t"+(15+5*i)+"\t"+String.format("%.3f",((15+5*i)/1.609))+"\t");
        }
    }
}
