package article.oop;

public class Car {
    private int speed;
    private String name;
    private String color;
    private int enginePower;

    public Car(){

    }

    public Car(int speed, String name, String color, int enginePower) {
        this.speed = speed;
        this.name = name;
        this.color = color;
        this.enginePower = enginePower;
    }

    public void accelerate(){
        System.out.println("The car is accelerating...");
    }

    public void setSpeed(int speed){
        if(speed >0){
            System.out.println("The speed has is greater than 0");
        }else {
            System.out.println("The speed is less than 0");
        }
    }

    public int getSpeed(){
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
