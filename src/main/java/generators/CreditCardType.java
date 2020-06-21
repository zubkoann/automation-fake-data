package generators;

public enum CreditCardType {
    VISA {
        public String getFirstNumber() {
            return "4";
        }
    },
    MASTERCARD {
        public String getFirstNumber() {
            return "5";
        }
    }, MAESTRO {
        public String getFirstNumber() {
            return "6";
        }
    };

    public abstract String getFirstNumber();
}
