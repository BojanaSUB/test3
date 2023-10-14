import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class CalculatorTest{

    @Test
    public void test_evaluateExpression()
    {
        String testExpression = "10-8/4-1";
        String expectedResult = "7.0";

        String actualResult = Calculator.Run(testExpression);

        assertEquals(expectedResult,actualResult);
    }

}