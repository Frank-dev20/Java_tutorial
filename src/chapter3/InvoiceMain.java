package chapter3;

import java.util.Scanner;

public class InvoiceMain
{
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("8080", "Battery", 7, 450.00);

    Scanner input = new Scanner(System.in);
        System.out.println("Enter the quantity of item you want to buy ");
        int quantityOfItems = input.nextInt();
        invoice1.setQuantityOfItems(quantityOfItems);

        System.out.println("Enter the price of items ");
        int price = input.nextInt();
        invoice1.setPrice(price);
        System.out.println("The price is " + invoice1.getPrice());
        System.out.println();
        System.out.println("The quantity of items is " + invoice1.getQuantityOfItems());
        System.out.println();

        System.out.println("The invoice amount is " + invoice1.getInvoiceAmount());
    }
}
