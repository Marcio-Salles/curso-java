package Fundamentos;

import java.util.Date;
import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia x";
        s=s.replace("x","Senhora");
        s=s.toUpperCase(Locale.ROOT);
        s=s.concat("!!!");

        System.out.println(s);

        Date d = new Date();

        System.out.println(d);
    }
}
