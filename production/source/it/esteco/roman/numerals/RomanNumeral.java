package it.esteco.roman.numerals;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class RomanNumeral {

    private static Map<Integer, String> decimalToNumeral = new TreeMap<>((o1, o2) -> o2 - o1);

    static {
        decimalToNumeral.put(1, "I");
        decimalToNumeral.put(4, "IV");
        decimalToNumeral.put(5, "V");
        decimalToNumeral.put(9, "IX");
        decimalToNumeral.put(10, "X");
        decimalToNumeral.put(40, "XL");
        decimalToNumeral.put(50, "L");
        decimalToNumeral.put(90, "XC");
        decimalToNumeral.put(100, "C");
        decimalToNumeral.put(400, "CD");
        decimalToNumeral.put(500, "D");
        decimalToNumeral.put(900, "CM");
        decimalToNumeral.put(1000, "M");
    }

    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    public String toString() {
        return findClosestKey().map(key -> decimalToNumeral.get(key) + new RomanNumeral(decimal - key)).orElse("");
    }

    private Optional<Integer> findClosestKey() {
        return decimalToNumeral.keySet().stream().filter(key -> decimal >= key).findFirst();
    }
}
