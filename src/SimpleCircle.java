public class SimpleCircle {
    public static void main(String[] args) {
        Circle smallCircle = new Circle();
        System.out.println("The area of this circle is small " + smallCircle.getArea());
        System.out.println();


        Circle bigCircle = new Circle(10);
        System.out.println("The area of this circle is big " + bigCircle.getArea());
    }
}
