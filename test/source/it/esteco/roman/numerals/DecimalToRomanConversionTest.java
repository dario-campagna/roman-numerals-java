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

    @Test
    public void threeIsIII() {
        check("III", 3);
    }

    @Test
    public void fourIsIV() {
        check("IV", 4);
    }

    @Test
    public void fiveIsV() {
        check("V", 5);
    }

    @Test
    public void sixIsVI() {
        check("VI", 6);
    }

    private void check(String expectedString, int decimal) {
        assertEquals(expectedString, new RomanNumeral(decimal).toString());
    }
}
