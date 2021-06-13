package oop;

public class Animal {
    private int legs;
    private String run;
    private String move;
    private String swim;

    public Animal(int legs, String run, String move, String swim) {
        this.legs = legs;
        this.run = run;
        this.move = move;
        this.swim = swim;
    }

    public String move(){
        return move;
    }
}
