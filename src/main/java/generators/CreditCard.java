package generators;

public class CreditCard {
    public String cardNumber;
    public String expireDate;
    public String creditCardType;

    public CreditCard(String cardNumber, String expireDate, int i) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.creditCardType = CreditCardType.values()[i].toString();
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
