package it.esteco.roman.numerals;

import java.util.Map;
import java.util.TreeMap;

public class RomanNumeral {

    private static Map<Integer, String> decimalToNumeral = new TreeMap<>((o1, o2) -> o2 - o1);

    static {
        decimalToNumeral.put(4, "IV");
        decimalToNumeral.put(5, "V");
        decimalToNumeral.put(9, "IX");
        decimalToNumeral.put(10, "X");
        decimalToNumeral.put(1, "I");
        decimalToNumeral.put(40, "XL");
    }

    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    public String toString() {
        if (decimalToNumeral.containsKey(decimal)) {
            return decimalToNumeral.get(decimal);
        }
        for (int key : decimalToNumeral.keySet()) {
            if (decimal > key) {
                return new RomanNumeral(key).toString() + new RomanNumeral(decimal - key);
            }
        }
        return "";
    }
}