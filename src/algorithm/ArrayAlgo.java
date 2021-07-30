package algorithm;

import java.util.Arrays;

public class ArrayAlgo {
    public static int[] sumArrayElementToGiveInt(int [] array, int b){
        int []arrays =new int[2];
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if(array[i] + array[j]==b){
                   arrays[0]=i;
                   arrays[1]=j;
                }
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        int[]sum = {1,2,3,4,5};
        ;
        System.out.println(Arrays.toString(sumArrayElementToGiveInt(sum,5)));
    }
}
