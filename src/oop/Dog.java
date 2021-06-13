package oop;

public class Dog extends Animal{
    private int tail;
    public Dog(int legs, int tail, String run, String move, String swim) {
        super(legs, run, move, swim);
    }

    public static void main(String[] args) {
        Animal animal1 = new Dog(4,1,"running", "moving","swimming");
        System.out.println(animal1.move());
    }
}
