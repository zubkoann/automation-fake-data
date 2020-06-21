package generators;

import api.Generator;

import java.util.Random;

public class CreditCardGenerator implements Generator {
    public static void main(String[] args) {
        System.out.println(getInt());


    }
    public CreditCard generate() {
        System.out.println(getInt());

        CreditCard creditCard = new CreditCard("sdfsdf", "fsfdf", 1);

        return creditCard;
    }
    private static String getInt(){
        Random r = new Random();
        int min = 1000;
        int max = 10000;
        int i = r.nextInt(max)-min;
        return String.valueOf(i);
    }
}
