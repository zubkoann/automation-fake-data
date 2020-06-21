package generators;

public class Currency {
    private String currency;

    public Currency(int i) {
        this.currency = CurrencyFormat.values()[i].toString();
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currency='" + currency + '\'' +
                '}';
    }
}
