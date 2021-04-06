package pl.ims.romannumerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * Created on 2021-04-06 13:01
 */
class ThousandsCharConverterTest {

    private final ThousandsCharConverter converter = new ThousandsCharConverter();

    @Test
    void shouldConvert0ToEmptyString() {
        assertEquals("", converter.convert(0));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfNumberIsGreaterThan3() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(4);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "1,M",
            "2,MM",
            "3,MMM"
    })
    void shouldConvert(int value, String expected) {
        String result = converter.convert(value);
        assertEquals(expected, result);
    }

}
