public class BMI_Main {
    public static void main(String[] args) {
        BMI health1 = new BMI("Joy", 215,70);
        BMI health2 = new BMI("Grace", 29, 145, 70);
        System.out.println("The Body Mass index for " + health1.getName() +" "+ "is " + health1.getBMI() + " and his"
                + " "+"BMI Status is "+" "+ health1.bmiStatus());

        System.out.println(health2.getName()+ " "+ health2.getBMI() + " " + health2.bmiStatus());
    }
}
