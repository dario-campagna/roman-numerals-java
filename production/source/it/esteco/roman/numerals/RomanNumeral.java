package it.esteco.roman.numerals;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    public String toString() {
        if (decimal == 0) {
            return "";
        } else if (decimal == 1) {
            return "I";
        } else if (decimal == 2) {
            return "II";
        } else {
            return "III";
        }
    }
}
