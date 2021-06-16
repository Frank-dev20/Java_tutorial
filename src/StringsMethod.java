public class StringsMethod {
    public static void main(String[] args) {
        String[] a = "Java,C?C#,C++".split("[.,:;?]");
        int i;
        for (i = 0; i < a.length-1; i++) ;
        System.out.println(a[i]);


        String s = String.format("%7.2f%6d%-4s, 45.56, 14, AB");
        System.out.println(s);
    }
}
