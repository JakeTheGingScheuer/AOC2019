package CounterUpper;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FuelCalculatorTest {

    FuelCalculator testCalc;

    @Test
    public void fuelCalculatorShouldDivideMassBy3() {

        testCalc = new FuelCalculator();
        int fakeMass = 12;
        int actual = testCalc.divideMass(fakeMass);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void fuelCalculatorShouldRoundDownWhenDividingMass() {

        testCalc = new FuelCalculator();
        int fakeMass = 14;
        int actual = testCalc.divideMass(fakeMass);
        int expected = 4;

        assertEquals(expected, actual);
    }
}
