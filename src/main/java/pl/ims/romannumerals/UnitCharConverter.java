package pl.ims.romannumerals;

/*
 * Created on 2021-03-31 10:08
 */
public class UnitCharConverter implements CharConverter {

    private final String[] tab = new String[] { "I", "II", "III"};

    @Override
    public String convert(int c) {
        if(c == 0) return "";
        else if(c < 4) return tab[c-1];
        else if(c == 4) return "IV";
        else if(c == 5) return "V";
        else if(c < 9) return "V"+tab[c-6];
        else return "IX";
    }

}
