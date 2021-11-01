package article.oop;

public class Toyota extends Car{
    private int registrationNumber;
    private int engineNumber;
    private static final int INCREMENT = 4;
    private int speed;
    private String name;
    private String color;
    private int enginePower;

    public Toyota() {
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    public static int getINCREMENT() {
        return INCREMENT;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
    
    public void accelerate(){
        super.accelerate();
        System.out.println("The Toyota is accelerating");
    }
}
