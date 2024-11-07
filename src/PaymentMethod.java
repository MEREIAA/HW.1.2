public class PaymentMethod implements Printable {
    String provider;


    public PaymentMethod(String provider) {
        this.provider = provider;
    }

    @Override
    public void print() {

        System.out.println("Name: " + provider);

    }
}
