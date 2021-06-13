import java.util.Scanner;

public class Population {
    public static void main(String[] args) {

        double year1;
        double year2;
        double year3;
        double year4;
        double year5;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current world population");
        double currentWorldPopulation = input.nextDouble();

        System.out.println("Enter world population growth rate");
        double worldPopulationGrowthRate = input.nextDouble();
//        worldPopulationGrowthRate =worldPopulationGrowthRate/100;

        year1 = currentWorldPopulation * (currentWorldPopulation * worldPopulationGrowthRate);
        System.out.println("The estimated one year population increase is " + year1);

        year2 = year1 + (year1*worldPopulationGrowthRate);
        System.out.println("The estimated world population for yer 2 is " + year2);

        //To get the estimated world population of the 3rd, and 4th year follow the pattern
    }
}









