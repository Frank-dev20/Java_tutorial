package algorithm;

public class AssignValueToArrayIndex {
    public static void main(String[] args) {
        int [] arrays = new int[11];
        for (int i =0; i< arrays.length;i++)
            arrays[i] = 1+1*i;

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int i = 0;  i< arrays.length ; i++) {
            System.out.printf("%3d%8d%n", i, arrays[i]);
        }

    }
}
