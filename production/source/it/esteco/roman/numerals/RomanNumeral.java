package it.esteco.roman.numerals;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    public String toString() {
        if (decimal == 0) {
            return "";
        } else {
            return "I" + new RomanNumeral(decimal - 1).toString();
        }
    }
}
