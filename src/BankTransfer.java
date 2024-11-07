public class BankTransfer extends PaymentMethod {
    String bankAccount;

    public BankTransfer(String provider, String bankAccount) {
        super(provider);
        this.bankAccount = bankAccount;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("bank Account: " + bankAccount);
    }
}
