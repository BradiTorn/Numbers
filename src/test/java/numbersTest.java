import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class numbersTest {

    @BeforeAll
    static void BeforeAll(){
        numbers number = new numbers();

        double[] actual = number.Sum(1,-4,4);
        double [] expected = new double[]{2,0};

        assertArrayEquals(actual,expected);
    }

    @AfterAll
    static void AfterAll(){
        numbers number = new numbers();
        double[] actual = number.Sum(2,2,2);
        double [] expected = new double[]{0,0};

        assertArrayEquals(actual,expected);
    }

    @org.junit.jupiter.api.Test
    void sum() {
        numbers number = new numbers();
        double[] actual = number.Sum(1,10,-39);
        double [] expected = new double[]{3,-13};

        assertArrayEquals(actual,expected);
    }
}