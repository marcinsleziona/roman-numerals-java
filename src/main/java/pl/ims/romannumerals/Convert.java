package pl.ims.romannumerals;

/*
 * Created on 2021-03-31 09:09
 */
public class Convert {

    private static final ArabicToRomanConverter arabicToRomanConverter = new ArabicToRomanConverter();

    public static void main(String[] args) {
        if(args.length != 1) {
            usage();
            return;
        }
        System.out.println(arabicToRomanConverter.convert(args[0]));
    }

    private static void usage() {
        System.out.println("java pl.ims.romannumerals.Convert <number_to_convert>");
    }

}
