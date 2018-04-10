package it.esteco.roman;

public class RomanNumeral {
    private int integer;

    public RomanNumeral(int integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        if (integer == 1) {
            return "I";
        }
        return "";
    }
}
