package it.esteco.roman;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class DecimalToRomanTest {

    @Test
    public void zeroIsEmptyString() {
        assertThat(new RomanNumeral(0).toString(), is(equalTo("")));
    }
}
