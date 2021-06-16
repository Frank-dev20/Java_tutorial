import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int max;
        System.out.println("Enter a number ");
        number = input.nextInt();
        max = number;

        while(number!=0) {
            System.out.println("Enter a number ");
            number = input.nextInt();
            if(number>max)
            max =number;
        }

        System.out.println("The maximum number is " + max);
    }
}
