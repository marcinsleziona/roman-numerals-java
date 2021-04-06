package pl.ims.romannumerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Created on 2021-04-06 13:01
 */
class HundredsCharConverterTest {

    private final HundredsCharConverter converter = new HundredsCharConverter();

    @Test
    void shouldConvert0ToEmptyString() {
        assertEquals("", converter.convert(0));
    }
    @ParameterizedTest
    @CsvSource({
            "1,C",
            "2,CC",
            "3,CCC",
            "4,CD",
            "5,D",
            "6,DC",
            "7,DCC",
            "8,DCCC",
            "9,CM"
    })
    void shouldConvert(int value, String expected) {
        String result = converter.convert(value);
        assertEquals(expected, result);
    }

}
