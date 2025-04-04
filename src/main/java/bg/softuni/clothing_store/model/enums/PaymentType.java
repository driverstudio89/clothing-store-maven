package bg.softuni.clothing_store.model.enums;

public enum PaymentType {
    ON_DELIVERY ("On Delivery"),
    CARD ("Card"),
    PAYPAL("PayPal");

    private final String value;


    PaymentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
