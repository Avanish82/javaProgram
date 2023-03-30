
import java.util.*;
public class LocaleExample {
    public static void main(String[] args) {
        //Locale locale = Locale.getDefault();
       // Locale locale=new Locale("fr","fr");//for the specific locale
        Locale locale=new Locale("us","us");
        System.out.println(locale.getDisplayCountry()); // India
        System.out.println(locale.getDisplayLanguage()); // English
        System.out.println(locale.getDisplayName()); // English (India)
        System.out.println(locale.getISO3Country()); // IND
        System.out.println(locale.getISO3Language()); // eng
        System.out.println(locale.getLanguage()); // en
        System.out.println(locale.getCountry()); // IN
    }
}