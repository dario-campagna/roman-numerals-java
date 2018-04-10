package it.esteco.roman;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DecimalToRomanTest {

    @Test
    public void zeroIsEmptyString() {
        check(0, "");
    }

    @Test
    public void oneIsI() {
        check(1, "I");
    }

    private void check(int integer, String expected) {
        assertThat(new RomanNumeral(integer).toString(), is(equalTo(expected)));
    }
}
