package it.esteco.roman.numerals;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    public String toString() {
        if (decimal == 0) {
            return "";
        } else if (decimal == 4) {
            return "IV";
        } else if (decimal == 5) {
            return "V";
        } else if (decimal == 9) {
            return "IX";
        } else {
            return new RomanNumeral(decimal - 1).toString() + "I";
        }
    }
}
