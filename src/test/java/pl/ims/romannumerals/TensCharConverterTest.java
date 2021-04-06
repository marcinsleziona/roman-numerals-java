package pl.ims.romannumerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Created on 2021-04-06 13:01
 */
class TensCharConverterTest {

    private final TensCharConverter converter = new TensCharConverter();

    @Test
    void shouldConvert0ToEmptyString() {
        assertEquals("", converter.convert(0));
    }

    @ParameterizedTest
    @CsvSource({
            "1,X",
            "2,XX",
            "3,XXX",
            "4,XL",
            "5,L",
            "6,LX",
            "7,LXX",
            "8,LXXX",
            "9,XC"
    })
    void shouldConvert(int value, String expected) {
        String result = converter.convert(value);
        assertEquals(expected, result);
    }

}
