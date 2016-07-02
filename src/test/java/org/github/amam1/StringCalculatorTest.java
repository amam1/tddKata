package org.github.amam1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void returns0ForEmptyString() {
        // given
        StringCalculator calculator = new StringCalculator();

        // when
        int result = calculator.add("");

        // then
        assertEquals(result, 0);
    }
}
