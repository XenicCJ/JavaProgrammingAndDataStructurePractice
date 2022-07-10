package C2_BasicProgramDesign;

/**
 * 打印一张有关乘方运算的表格，显示整数
 */
public class P18_PrintTable {
    public static void main(String[] args) {
        System.out.println("\ta\tb\tpow(a, b)");
        System.out.println("\t1\t2\t"+(int)Math.pow(1,2));
        System.out.println("\t2\t3\t"+(int)Math.pow(2,3));
        System.out.println("\t3\t4\t"+(int)Math.pow(3,4));
        System.out.println("\t4\t5\t"+(int)Math.pow(4,5));
        System.out.println("\t5\t6\t"+(int)Math.pow(5,6));
    }
}
