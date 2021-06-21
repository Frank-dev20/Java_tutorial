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
        int[] array={27,45,40,27,67,23,78,50,78,50,60};
        assertTrue(flight.movieAndFlightTime(90,array));
    }
}