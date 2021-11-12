import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class numbersTest {

    @BeforeAll
    static void BeforeAll(){
        System.out.println("До");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("После");
    }

    @org.junit.jupiter.api.Test
    void sum() {
        numbers number = new numbers();
        int actual = number.Sum(5);
        int expected = 15;
        assertEquals(expected,actual);
    }
}