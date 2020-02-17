package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class calculatorTest {

    calculator myCalculator;

    @BeforeEach
    void init(){
        myCalculator = new calculator();
    }

    @DisplayName("Addition Test Check")
    @Test
    void testAddNum() {
        myCalculator = new calculator();
        assertEquals(11,2,myCalculator.Addsum(5,6));
    }
    @DisplayName("Subtract Test Check")
    @Test
    void testSubtractSum() {
        myCalculator = new calculator();
        assertEquals(4,2,myCalculator.SubtractSum(10,6));
    }

    @DisplayName("Multiply Test Check")
    @Test
    void testMultiplyNum() {
        myCalculator = new calculator();
        assertEquals(20,2,myCalculator.MultSum(4,6));
    }

    @DisplayName("Divide Test Check")
    @Test
    void testDivideNum() {
        myCalculator = new calculator();
        assertEquals(3,2,myCalculator.DivSum(6,2));
    }



}
