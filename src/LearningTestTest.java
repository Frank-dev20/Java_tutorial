import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.Person;

import static org.junit.jupiter.api.Assertions.*;

class LearningTestTest {
    Person person;
    @BeforeEach
    void setUp() {

        person = new Person();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void creatAPerson(){
//        Person person = new Person();
        assertEquals("Frank", person.createPerson());

    }
}