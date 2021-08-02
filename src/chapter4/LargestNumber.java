package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int count =10;
        int number;
        int largest;
        System.out.println("Enter a number ");
        number = input.nextInt();
        largest=number;
        while(number!=0){
            System.out.println("enter a number ");
            number = input.nextInt();
            if(number>largest) {
                largest = number;
            }
        }
        System.out.println(largest);
    }
}
