package pl.ims.romannumerals;

import java.util.Arrays;

/*
 * Created on 2021-03-31 10:08
 */
public class ThousandsCharConverter implements CharConverter {

    @Override
    public String convert(int c) {
        if(c == 0) return "";
        if(c > 3) throw new IllegalArgumentException("Standard Roman Numerals handle numbers up to 3999 !");
        char[] tab = new char[c];
        Arrays.fill(tab, 'M');
        return new String(tab);
    }
}
