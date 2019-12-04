package CounterUpper;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FuelCalculatorTest {

    FuelCalculator testCalc = new FuelCalculator();

    @Test
    public void calculateFuelShouldDivideMassBy3RoundDownThenSubtract2() {
        int fakeMass = 14;
        int actual = testCalc.calculateFuel(fakeMass);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void calculateFuelAcceptanceTest1() {
        int fakeMass = 1969;
        int actual = testCalc.calculateFuel(fakeMass);
        int expected = 654;

        assertEquals(expected, actual);
    }

    @Test
    public void calculateFuelAcceptanceTest2() {
        int fakeMass = 100756;
        int actual = testCalc.calculateFuel(fakeMass);
        int expected = 33583;

        assertEquals(expected, actual);
    }

    @Test
    public void calculateAllReturnsTheTotalFuelNeededForTheMassesGiven() {
        int[] fakeMasses = {14, 1969, 100756};
        int expected = 2+654+33583;
        int actual = testCalc.calculateAll(fakeMasses);

        assertEquals(expected, actual);
    }
}
