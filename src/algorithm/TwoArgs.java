package algorithm;

public class TwoArgs {
    static int [] array = {5,4,6,7,8};
    static int number = 2;
    static int []newArray;

    public static void MoveArrayItems(int []arrays, int num){
        for (int i=0; i< arrays.length;i++) {
            if (num > 0) {
                arrays[i] = arrays.length;

            }

        }
    }

    public static void main(String[] args) {
        int []temp= {0,0,0,0,0};
        MoveArrayItems(array, number);
        for (int i = 0; i < array.length ; i++) {
            newArray[array[i]] = array[i] ;
            newArray[5] = array[i];
            temp = newArray;
        }

        System.out.println(temp);
    }

}
