import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }
    @Test


    void dateObject(){
        Date date1 = new Date(10,14,2002);
        Date date2 = new Date("March", 3, 2005);
//        Date date3 = new Date(182, 2000);

        System.out.printf("Date object with 3 int args -> %n%s%s", date1);
        System.out.printf("Date object with String(Month), int(day), int(year)-> %n%s%s", date2);
//        System.out.printf("");

//        assertEquals(10, date1.getMonth());
//        assertEquals(12, date1.getDay());
//        assertEquals(2002, date1.getYear());
    }
}