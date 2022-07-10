package C10_ObjectOrientedThink;

/**
 * a bmi class with name, age, height, weight
 */
public class P2_BMI {
    String name="";
    int age=0;
    //weight in pound
    double weight=0;
    //height in feet and inches
    double feet=0;
    double inches=0;

    double bmi=0;

    public P2_BMI(String name, int age, double weight, double feet, double inches){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.feet=feet;
        this.inches=inches;

        bmi=weight*0.4536/Math.pow((feet*0.3048+inches*0.0254),2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
}
