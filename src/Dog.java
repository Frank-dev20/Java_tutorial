public class Dog {
    String name;
    int age;
    String color;
    String breed;

    public Dog(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public boolean isSleeping(){
        System.out.println("Sleeping");
        return true;
    }

    public boolean eating(){
        System.out.println("Eating");
        return true;
    }

    public boolean barking(){
        System.out.println("Dog barking...");
        return true;
    }

    public boolean running() {
        System.out.println("Dog running");
        return true;

    }

}
