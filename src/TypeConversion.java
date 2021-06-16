public class TypeConversion {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(3);
        System.out.println(i.intValue());
        System.out.println(i.doubleValue());
        System.out.println(i.intValue());
        System.out.println(i.compareTo(Integer.valueOf(4)));

        Double x =  Double.valueOf(4.5);
        System.out.println(x.intValue());

        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("11",10));


    }
}
