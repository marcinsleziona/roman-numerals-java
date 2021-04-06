package pl.ims.romannumerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Created on 2021-04-06 13:01
 */
class UnitCharConverterTest {

    private final UnitCharConverter converter = new UnitCharConverter();

    @Test
    void shouldConvert0ToEmptyString() {
        assertEquals("", converter.convert(0));
    }

    @ParameterizedTest
    @CsvSource({
            "1,I",
            "2,II",
            "3,III",
            "4,IV",
            "5,V",
            "6,VI",
            "7,VII",
            "8,VIII",
            "9,IX"
    })
    void shouldConvert(int value, String expected) {
        String result = converter.convert(value);
        assertEquals(expected, result);
    }

}
