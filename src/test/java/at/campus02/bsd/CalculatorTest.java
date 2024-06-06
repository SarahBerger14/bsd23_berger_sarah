package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @BeforeEach
    public void setNew(){
  Calculator calculator = new Calculator();
    }

        static {
            System.setProperty("log4j.configurationFile", "log4j2.xml");
        }

    @Test
    public void testAddOne() {
        Assertions.assertEquals(12.0, Calculator.add(5.0,7.0), 0.001);
    }

    @Test
    public void testAddTwo() {
        Assertions.assertEquals(-30.5, Calculator.add(-10.5,-20.0), 0.001);
    }

    @Test
    public void testAddThree() {
        Assertions.assertEquals(0.0, Calculator.add(0.0,0.0), 0.001);
    }

    @Test
    public void testSubtractOne() {
        Assertions.assertEquals(2.2, Calculator.minus(5.3,3.1), 0.001);
    }

    @Test
    public void testSubtractTwo() {
        Assertions.assertEquals(0.0, Calculator.minus(10.5,10.5), 0.001);
    }

    @Test
    public void testSubtractThree() {
        Assertions.assertEquals(320.1, Calculator.minus(300.1,-20.0), 0.001);
    }

    @Test
    public void testMultiplyOne() {
        Assertions.assertEquals(7.26, Calculator.multiply(2.2,3.3), 0.001);
    }

    @Test
    public void testMultiplyTwo() {
        Assertions.assertEquals(-322.0, Calculator.multiply(14.0,-23.0), 0.001);
    }

    @Test
    public void testMultiplyThree() {
        Assertions.assertEquals(0.0, Calculator.multiply(0.0,4.45), 0.001);
    }

    @Test
    public void testDivideOne() {
        Assertions.assertEquals(3.0, Calculator.divide(6.0,2.0), 0.001);
    }

    @Test
    public void testDivideTwo() {
        Assertions.assertEquals(1.0, Calculator.divide(4.4,4.4), 0.001);
    }

    @Test
    public void testDivideThree() {
        Assertions.assertEquals(40.0, Calculator.divide(120.0,3.0), 0.001);
    }

    @Test
    public void testFactorialOne() {
        Assertions.assertEquals(1, Calculator.factorial(0.0), 0.001);
    }

    @Test
    public void testFactorialTwo() {
        Assertions.assertEquals(1, Calculator.factorial(1.0),0.001);
    }

    @Test
    public void testFactorialThree() {
        Assertions.assertEquals(0, Calculator.factorial(-3.0),0.001);
    }

    @Test
    public void testFactorialFour() {
        Assertions.assertEquals(24, Calculator.factorial(4.0),0.001);
    }

    @Test
    public void testFactorial() {
        testFactorialOne();
        testFactorialTwo();
        testFactorialThree();
        testFactorialFour();
        testDivideByZero();
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(5,0);
        });
    }
}
