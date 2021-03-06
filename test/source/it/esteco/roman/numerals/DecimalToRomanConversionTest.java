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

    @Test
    public void nineIsIX() {
        check("IX", 9);
    }

    @Test
    public void tenIsX() {
        check("X", 10);
    }

    @Test
    public void fourteenIsXIV() {
        check("XIV", 14);
    }

    @Test
    public void fortyIsXL() {
        check("XL", 40);
    }

    @Test
    public void fiftyIsL() {
        check("L", 50);
    }

    @Test
    public void oneHundredIsC() {
        check("C", 100);
    }

    @Test
    public void fiveHundredIsD() {
        check("D", 500);
    }

    @Test
    public void oneThousandIsM() {
        check("M", 1000);
    }

    @Test
    public void fourHundredIsCD() {
        check("CD", 400);
    }

    @Test
    public void ninetyIsXC() {
        check("XC", 90);
    }

    @Test
    public void fourHundredNinetyFour() {
        check("CDXCIV", 494);
    }

    @Test
    public void nineHundredIsCM() {
        check("CM", 900);
    }

    @Test
    public void oneThousandNineHundredEightyThreeIsMCMLXXXIII() {
        check("MCMLXXXIII", 1983);
    }

    @Test
    public void twoThousandFourHundredTwelveIsMMCDXII() {
        check("MMCDXII", 2412);
    }

    @Test
    public void threeThousandThreeHundredNineIsMMMCCCIX() {
        check("MMMCCCIX", 3309);
    }

    private void check(String expectedString, int decimal) {
        assertEquals(expectedString, new RomanNumeral(decimal).toString());
    }
}
