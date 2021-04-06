package pl.ims.romannumerals;

/*
 * Created on 2021-03-31 10:08
 */
public class HundredsCharConverter implements CharConverter {

    private final String[] tab = new String[] { "C", "CC", "CCC"};

    @Override
    public String convert(int c) {
        if(c == 0) return "";
        else if(c < 4) return tab[c-1];
        else if(c == 4) return "CD";
        else if(c == 5) return "D";
        else if(c < 9) return "D"+tab[c-6];
        else return "CM";
    }
}
