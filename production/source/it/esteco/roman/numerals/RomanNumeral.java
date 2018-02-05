package it.esteco.roman.numerals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Integer, String> decimalToNumeral = new HashMap<>();

    static {
        decimalToNumeral.put(0, "");
        decimalToNumeral.put(4, "IV");
        decimalToNumeral.put(5, "V");
        decimalToNumeral.put(9, "IX");
        decimalToNumeral.put(10, "X");
    }

    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    public String toString() {
        if (decimalToNumeral.containsKey(decimal)) {
            return decimalToNumeral.get(decimal);
        } else {
            return new RomanNumeral(decimal - 1).toString() + "I";
        }
    }
}