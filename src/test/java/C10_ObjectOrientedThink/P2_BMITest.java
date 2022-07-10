package C10_ObjectOrientedThink;

/**
 * a bmi class with name, age, height, weight
 */
public class P2_BMITest {
    public static void main(String[] args) {
        P2_BMI bmi=new P2_BMI("Chris Sean", 26,170,5,11);
        System.out.println(bmi.getBmi());
    }
}
