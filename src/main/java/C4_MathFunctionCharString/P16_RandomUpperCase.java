package C4_MathFunctionCharString;

/**
 * 用随机函数显示一个随机大写字母
 */
public class P16_RandomUpperCase {
    public static void main(String[] args) {
        char c=(char)('A'+(int)(Math.random()*26));
        System.out.println("An uppercase alphabet: "+c);
    }
}
