package algorithm;

public class SumElementInAnArray {
    public static void main(String[] args) {
        int []arrays = {2,3,4,5,6,7,8,9};
        int i;
        int total=0;
        for(i = 0; i< arrays.length; i++)
            total += arrays[i];

        System.out.println(total);
    }
}
