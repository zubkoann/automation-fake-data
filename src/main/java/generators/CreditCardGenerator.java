package generators;

import api.Generator;

public class CreditCardGenerator implements Generator {

    public CreditCard generate() {
        CreditCard creditCard = new CreditCard(1);
        return creditCard;
    }

}
