public class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double kilogram_per_pounds=0.453;
    public static final double meter_per_inch = 0.0254;



    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height){
        this.name =name;
        this.weight = weight;
        this.height = height;
        age = 20;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI(){
        double BMI = weight * kilogram_per_pounds / ((height*meter_per_inch)*(height*meter_per_inch));
        return BMI;
    }

    public String bmiStatus(){
        double BMI = getBMI();
        if(BMI < 18.5)
            return "Underweight";
        else if(BMI<25)
            return "Normal";
        else if(BMI<30)
            return "Overweight";
        else if(BMI>=30)
            return "Obese";
        return bmiStatus();
    }
}
