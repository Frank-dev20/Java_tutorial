package algorithm;

public class ArrayColumn {
    public static void main(String[] args) {
        int [] arrays = new int [5];
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int count = 0; count< arrays.length; count++){
            System.out.printf("%3d%8d%n", count, arrays[count]);
        }
    }
}
