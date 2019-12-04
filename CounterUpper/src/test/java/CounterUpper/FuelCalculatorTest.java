package CounterUpper;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FuelCalculatorTest {

    FuelCalculator testCalc = new FuelCalculator();

    @Test
    public void divideMassShouldDivideBy3() {

        int fakeMass = 12;
        int actual = testCalc.divideMass(fakeMass);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void divideMassShouldRoundDown() {

        int fakeMass = 14;
        int actual = testCalc.divideMass(fakeMass);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void subtractMassShouldSubtract2() {
        int fakeMass = 5;
        int actual = testCalc.subtractMass(fakeMass);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void calculateFuelShouldDivideMassThenSubtract() {
        int fakeMass = 12;
        int actual = testCalc.calculateFuel(fakeMass);
        int expected = 2;

        assertEquals(expected, actual);
    }
}
