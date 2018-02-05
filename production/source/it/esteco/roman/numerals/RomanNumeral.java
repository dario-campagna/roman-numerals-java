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
        decimalToNumeral.put(50, "L");
        decimalToNumeral.put(100, "C");
        decimalToNumeral.put(500, "D");
        decimalToNumeral.put(1000, "M");
        decimalToNumeral.put(400, "CD");
        decimalToNumeral.put(90, "XC");
        decimalToNumeral.put(900, "CM");
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