import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {
        int sum =0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int value = input.nextInt();

        while(value !=0){
            sum+=value;


            System.out.println("Enter a number ");
            value = input.nextInt();

            System.out.println("The sum of numbers is "+ sum);
        }
    }
}
