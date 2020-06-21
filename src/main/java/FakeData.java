import generators.*;

import java.awt.*;

public class FakeData {

    private Color color;
    private Currency currency;
    private CreditCard card;

    public FakeData() {
        color = new ColorGenerator().generate();
        currency = new CurrencyGenerator().generate();
        card = new CreditCardGenerator().generate();
    }

    public Color getColor() {
        return color;
    }

    public Currency getCurrency() {
        return currency;
    }

    public CreditCard getCard() {
        return card;
    }
}
