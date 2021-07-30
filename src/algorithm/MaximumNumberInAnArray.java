package algorithm;

public class MaximumNumberInAnArray {
    static int [] array1 = {50,90,45,67,32,56,70};
    static int max=0;
     public static int calculateTheMaxNumInAnArray(int []array){
            max= array[0];
         for (int i = 0; i < array.length; i++) {
             if(array[i] > max)
                 max = array[i];
         }
        return max;
     }

    public static void main(String[] args) {
        calculateTheMaxNumInAnArray(array1);
        System.out.printf("The maximum number is: %d%n", max);
//        for (int i = 0; i < array1.length; i++) {
//            if(array1[i] > max)
//                max =array1[i];
//        }
     }
}
