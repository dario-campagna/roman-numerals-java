package it.esteco.roman.numerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecimalToRomanConversionTest {

    @Test
    public void zeroConvertsToEmptyString() {
        assertEquals("", new RomanNumeral(0).toString());
    }
}
