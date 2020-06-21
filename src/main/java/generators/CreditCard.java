package generators;

import java.time.LocalDateTime;
import java.util.Random;

public class CreditCard {
    public String cardNumber;
    public String expireDate;
    public String creditCardType;

    public CreditCard(int i) {
        this.cardNumber = CreditCardType.values()[i].getFirstNumber() + getInt().substring(0, 3) + " " + getInt() + " " + getInt() + " " + getInt();
        this.expireDate = getExpiredDate();
        this.creditCardType = CreditCardType.values()[i].toString();
    }

    private String getInt() {
        Random r = new Random();
        int min = 1000;
        int max = 10000;
        int i = r.nextInt((max - min) + 1) + min;
        return String.valueOf(i);
    }

    private String getExpiredDate() {
        Random r = new Random();
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear() - r.nextInt(4);
        int month = (now.getMonthValue() + r.nextInt(12)) % 12;
        int min = year;
        int max = year + 5;
        year = r.nextInt((max - min) + 1) + min;
        return String.valueOf(month) + "/" + String.valueOf(year).substring(2, 4);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", creditCardType='" + creditCardType + '\'' +
                '}';
    }
}
