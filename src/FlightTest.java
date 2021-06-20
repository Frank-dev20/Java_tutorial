import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {
    Flight flight;


    @BeforeEach
    void setUp() {
        flight = new Flight();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void flightTime(){
        int[] array={23,45,40,27,67,27,78,50,78,50,60};
        assertTrue(flight.movieAndFlightTime(100,array));
    }
}