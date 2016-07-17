package org.github.amam1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator calculator = new StringCalculator();

    @Test
    public void returns0ForEmptyString() {
        // given

        // when
        int result = 0;
        try {
            result = calculator.add("");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // then
        assertEquals(result, 0);
    }

    @Test
    public void shouldAdd1ToString() throws Exception {
        assertAdd(1, "1");
    }

    @Test
    public void shouldAdd2Numbers() throws Exception {
        assertAdd(2, "1 1");
    }

    @Test
    public void shouldAdd2Numbers2() throws Exception {
        assertAdd(51, "45 6");
    }


    @Test
    public void shouldAdd2NumbersSeparatedByComa() throws Exception {
        assertAdd(3, "1,2");
    }
   @Test
    public void shouldAddNumbersSeparatedByComaSpaceNewLine() throws Exception {
        assertAdd(16, "1, 2\n9,4");
    }

    @Test
    public void shouldAddNumbersSeparatedByOtherDemiliters() throws Exception {
        assertAdd(3, "//;\n1;2");
    }

    @Test
    public void NegativeNumberShouldThrowException()  {
        try {
            assertAdd(3, "//;\n1;-2");
            fail("did not throw Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private void assertAdd(int result, String nums) throws Exception {
            assertEquals(result, calculator.add(nums));

    }
}
