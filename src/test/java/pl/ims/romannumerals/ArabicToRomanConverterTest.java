package pl.ims.romannumerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * Created on 2021-04-06 13:18
 */
class ArabicToRomanConverterTest {

    private final ArabicToRomanConverter converter = new ArabicToRomanConverter();

    @Test
    void shouldThrowIllegalArgumentExceptionIfNumberIsGreaterThan3999() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert("4000");
        });
    }

    @ParameterizedTest
    @CsvSource({
            "1,I",
            "11,XI",
            "57,LVII",
            "98,XCVIII",
            "192,CXCII",
            "999,CMXCIX",
            "1491,MCDXCI",
            "1987,MCMLXXXVII",
            "2021,MMXXI"
    })
    void shouldConvert(String value, String expected) {
        String result = converter.convert(value);
        assertEquals(expected, result);
    }

}
