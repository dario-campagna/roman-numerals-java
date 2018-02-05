package it.esteco.roman.numerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecimalToRomanConversionTest {

    @Test
    public void zeroIsEmpty() {
        assertEquals("", new RomanNumeral(0).toString());
    }

    @Test
    public void oneIsI() {
        assertEquals("I", new RomanNumeral(1).toString());
    }
}
