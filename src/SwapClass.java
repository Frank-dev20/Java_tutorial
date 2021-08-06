public class SwapClass {
    public static void swapMethod(int i, int a){
        System.out.println("The value of i and a before swap is : " + i + " " + a);
        int temp =i;
        i=a;
        a=temp;

        System.out.println("The value of i and a after swap is: "+ i + " "+ a);

    }

    public static void main(String[] args) {

        int i = 40;
        int a = 90;
        swapMethod(i, a);
    }
}
