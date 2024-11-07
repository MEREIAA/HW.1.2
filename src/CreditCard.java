public class CreditCard extends PaymentMethod {
    int creditLimit;

    public CreditCard(String provider, int creditLimit) {
        super(provider);
        this.creditLimit = creditLimit;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Credit limit: " + creditLimit);
    }
}
