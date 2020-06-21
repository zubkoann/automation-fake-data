import java.awt.Color;

import generators.*;

public class App {
    public static void main(String[] args) {
        Color d = new ColorGenerator().generate();
//        System.out.println(d);

        String v = new CurrencyGenerator().generate().getCurrency();
//        System.out.println(v);

        CreditCard h = new CreditCardGenerator().generate();
        System.out.println(h.getCreditCardType());

    }
}
