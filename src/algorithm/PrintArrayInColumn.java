package algorithm;

public class PrintArrayInColumn {
    public static void main(String[] args) {
        int []arraysColumn = { 20,30,40,50,60,70,80,90};

        System.out.printf("%s%10s%n", "Index", "Value");

        for(int i = 0; i< arraysColumn.length; i++)
        System.out.printf("%3d%11d%n", i, arraysColumn[i]);
    }
}
