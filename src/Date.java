public class Date {

    private final String[] MONTHS={
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
    };

    private final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30,
            31,30,31,31,
            30, 31, 30, 31
    };

    private int month;
    private int day;
    private int year;
    private int daysInAYear;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
        this.daysInAYear = calculateDaysInAYear(month, day);

    }

    public Date(String month, int day, int year) {
        this.day =day;
        this.year = year;
       int result= getMonthIndex(month);
       if(result<0){
           throw new IllegalArgumentException("Month is not valid");
       }
       this.month=result;

    }


    public Date(int day, int year) {
        this.year = year;

        if(day<=31 && day>0){
            this.day = day;
            this.month=1;
        }
        else{
            calculateMonthAndDay(day);
        }


    }



    private int getMonthIndex(String month){
        for(int i =0; i< MONTHS.length; i++){
            if(month.equals(MONTHS[i])){
                return i+1;
            }
        }
        return -1;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void calculateMonthAndDay(int daysInAYear){
        int count = 0;
        for(int i=0; i< DAYS_IN_MONTHS.length; i++){
            daysInAYear -= DAYS_IN_MONTHS[i];

            if(daysInAYear <= 31 && daysInAYear>0){
                setDay(daysInAYear);
                setMonth(i+2);
            }
        }
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%d%n%s %d, %d",
                month, day, year, this.MONTHS[month-1], day, year);
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int calculateDaysInAYear(int month, int day){
        int sum = day;
        for(int i=0; i< month-1; i++){
            sum += DAYS_IN_MONTHS[i];
        }
        return sum;

    }
}
