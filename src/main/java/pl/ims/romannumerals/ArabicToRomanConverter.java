package pl.ims.romannumerals;

/*
 * Created on 2021-03-31 09:10
 */
public class ArabicToRomanConverter {

    private final ThousandsCharConverter thousandsCharConverter = new ThousandsCharConverter();

    private final CharConverter[] charConverters = new CharConverter[] {
            new UnitCharConverter(), new TensCharConverter(), new HundredsCharConverter()
    };

    public String convert(String number) {
        if(number == null) {
            return null;
        }
        if(number.trim().length() == 0) {
            return "";
        }
        char[] chars = number.toCharArray();
        int idx = 1;
        StringBuilder ret = new StringBuilder();
        for(int i = chars.length-1; i >= 0; i--) {
            char c = chars[i];
            if(idx <= charConverters.length) {
                ret.insert(0, charConverters[idx - 1].convert(c - 48));
                idx++;
                continue;
            }
            break;
        }
        if(chars.length >= 4) {
            ret.insert(0, thousandsCharConverter.convert(Integer.parseInt(number.substring(0, number.length() - 3))));
        }
        return ret.toString();
    }


}
