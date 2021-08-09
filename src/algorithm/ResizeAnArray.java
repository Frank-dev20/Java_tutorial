package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ResizeAnArray {
    static Scanner scanner = new Scanner(System.in);
    private static int [] array = new int[6];

    public static void populateArray(){
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[]array1){
        for (int i = 0; i < array1.length ; i++) {
            System.out.println(array1[i] + " ");
            System.out.println();
        }
    }
    public static void resizedArray(){
        int [] original = array;
        array= new int[10];
        for (int i = 0; i < original.length; i++) {
             array[i]=original[i];
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter integers: ");
        populateArray();
        printArray(array);
        System.out.println();
        resizedArray();
        System.out.println("Enter integers: ");
        populateArray();
        printArray(array);



    }
}
