package chapter4;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int workedHours_1;
        int hourlyRate;
        int grossPay;
        System.out.println("Enter employee name ");
        String employee1_Name = input.next();

        System.out.println("Enter employee hours worked ");
        workedHours_1 = input.nextInt();

        System.out.println("Enter employee hourly rate ");
        hourlyRate = input.nextInt();

        grossPay = workedHours_1 * hourlyRate;

        System.out.println("Employee's name is " + employee1_Name + " " + "And his gross pay is " + grossPay);
    }
}
