package Diya_Web_assignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest
{

    @Test
    public void testAddition() 
    {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction()
    {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() 
    {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(6, 7);
        assertEquals(42, result);
    }

    @Test
    public void testDivision() 
    {
        Calculator calculator = new Calculator();
        double result = calculator.divide(20, 5);
        assertEquals(4.0, result, 0.0001); // Allow for a small margin of error in double comparison
    }

}
