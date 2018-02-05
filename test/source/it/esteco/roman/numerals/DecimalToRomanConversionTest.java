package it.esteco.roman.numerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecimalToRomanConversionTest {

    @Test
    public void zeroIsEmpty() {
        check("", 0);
    }

    @Test
    public void oneIsI() {
        check("I", 1);
    }

    @Test
    public void twoIsII() {
        check("II", 2);
    }

    private void check(String expectedString, int decimal) {
        assertEquals(expectedString, new RomanNumeral(decimal).toString());
    }
}
