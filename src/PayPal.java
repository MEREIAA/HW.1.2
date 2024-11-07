public class PayPal extends PaymentMethod {
    String email;

    public PayPal(String provider, String email) {
        super(provider);
        this.email = email;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("email: " + email);
    }
}
