public class Dog_Main {
    public static void main(String[] args) {
        Dog littleDog = new Dog("Bingo", 6,"Brown", "German Shepherd");
        System.out.println("Is the dog running:? "+ littleDog.running());
        System.out.println();
        System.out.println("is the dog sleeping:? " + littleDog.isSleeping());
        System.out.println();
        System.out.println("Is the dog barking:? " + littleDog.barking());
        System.out.println();
        System.out.println("Is the dog eating:? " + littleDog.eating());
        System.out.println();
        System.out.println("The dog name is: " + littleDog.name);
    }
}
