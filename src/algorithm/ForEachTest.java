package algorithm;

public class ForEachTest {
    public static void main(String[] args) {
        int total =0;
        int arrays [] = {2,3,4,5,6,7,8};
//        for (int i = 0; i < arrays.length; i++) {
//            total +=arrays[i];


        for (int number: arrays)
            total +=number;

        System.out.println(total);
    }
}
