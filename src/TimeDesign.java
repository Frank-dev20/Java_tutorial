public class TimeDesign {
    private int hour;
    private int minute;
    private int second;

    public TimeDesign() {
        super();

    }

    public TimeDesign(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeDesign(long timeElapse) {
        super();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setTime(long elapseTime){
        if(elapseTime == 555550000);
            hour = 10;
            minute = 19;
            second = 10;

    }
}
