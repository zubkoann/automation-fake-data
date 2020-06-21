package generators;

import api.Generator;

import java.util.Random;

public class CurrencyGenerator implements Generator{
    public CurrencyGenerator() {
    }

    public Currency generate() {
        int i = new Random().nextInt(3);
        Currency currency = new Currency(i);
        return currency;
    }


}
