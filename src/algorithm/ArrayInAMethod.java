package algorithm;

public class ArrayInAMethod {
    static int [] array = {2,35,6,8,9,10};

    public static void multiplyArrayItemsBy3(int []array1){
        for (int i = 0; i < array1.length; i++) {
            array1[i] *=3;
        }
    }

    public static void multiplyAnElementBy2(int element){
        element*=2;
        System.out.printf("Value of modified element: %d%n", element);
    }

    public static void main(String[] args) {
        for (int value: array)
            System.out.printf(" %d ", value);
        System.out.println();

        multiplyArrayItemsBy3(array);
        System.out.println("Value of modified array " );
        for (int value: array)
            System.out.println(value);



        multiplyAnElementBy2(array[3]);
        System.out.printf("array[3]: value of modified element: %d%n ", array[3]);

    }
}
