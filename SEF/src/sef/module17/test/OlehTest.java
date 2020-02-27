package sef.module17.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sef.module17.sample.Oleh;

import static org.junit.Assert.*;

public class OlehTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
    }

    @Test
    public void add() {
        Oleh calculator = new Oleh();
        int actual = calculator.add(1, 2);
        int expected = 4;
        assertEquals(actual, expected);
    }
}