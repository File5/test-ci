import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private Main main;

    @Before
    public void init() {
        main = new Main();
    }

    @Test
    public void testSum_always_returnValidValue() throws Exception {
        int a = 5;
        int b = 9;
        int expected = a + b;

        int actual = main.sum(a, b);

        assertEquals(expected, actual);
    }

}