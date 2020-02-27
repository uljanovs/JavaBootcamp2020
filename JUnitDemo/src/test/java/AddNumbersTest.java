import static org.junit.Assert.*;

public class AddNumbersTest {

    @org.junit.Test
    public void add() throws Exception {
        AddNumbers calculator = new AddNumbers();
        int actual = calculator.add(1, 2);
        int expected = 3;
        assertEquals(actual, expected);
    }
}