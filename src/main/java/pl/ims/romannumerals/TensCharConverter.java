package pl.ims.romannumerals;

/*
 * Created on 2021-03-31 10:08
 */
public class TensCharConverter implements CharConverter {

    private final String[] tab = new String[] { "X", "XX", "XXX"};

    @Override
    public String convert(int c) {
        if(c == 0) return "";
        else if(c < 4) return tab[c-1];
        else if(c == 4) return "XL";
        else if(c == 5) return "L";
        else if(c < 9) return "L"+tab[c-6];
        else return "XC";
    }
}
