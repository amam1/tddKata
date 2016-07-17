package org.github.amam1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator calculator = new StringCalculator();

    @Test
    public void returns0ForEmptyString() {
        // given

        // when
        int result = calculator.add("");

        // then
        assertEquals(result, 0);
    }

    @Test
    public void shouldAdd1ToString() {
        assertAdd(1, "1");
    }

    @Test
    public void shouldAdd2Numbers() {
        assertAdd(2, "1 1");
    }


    private void assertAdd(int result, String nums) {
        assertEquals(result, calculator.add(nums));
    }
}
