
import java.text.SimpleDateFormat;
import java.util.*;

 

public class LocaleList {
    public static void main(String[] args) {
        Locale[] locales = SimpleDateFormat.getAvailableLocales();
        for (int i = 0; i < locales.length; i++) {
            System.out
                    .printf("%10s -%s, %s \n", locales[i].toString(),
                            locales[i].getDisplayName(),
                            locales[i].getDisplayCountry());
        }
    }
}