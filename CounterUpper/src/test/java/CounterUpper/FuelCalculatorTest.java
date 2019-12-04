package CounterUpper;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FuelCalculatorTest {

    FuelCalculator testCalc;

    @Test
    public void fuelCalculatorDividesMassBy3() {
        testCalc = new FuelCalculator();
        int fakeMass = 12;
        int actual = testCalc.divideMass(fakeMass);
        int expected = 4;

        assertEquals(expected, actual);

    }
}
