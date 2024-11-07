public class Main {
    public static void main(String[] args) {



        PaymentMethod bankTransfer = createObject("2nd");
        PaymentMethod creditCard = createObject("3rd");
        PaymentMethod payPal = createObject("4rd");

        PaymentMethod[] paymentMethods = {bankTransfer, creditCard, payPal};
        for (PaymentMethod paymentMethod : paymentMethods) {
            if (paymentMethod != null) {
                paymentMethod.print();
            }
        }
    }

    public static PaymentMethod createObject(String className) {
        switch (className) {
            case "2nd":
                return new BankTransfer("BankTransfer ", "1");
            case "3rd":
                return new CreditCard("CreditCard ", 100000);
            case "4rd":
                return new PayPal("PayPal ", "name@gmail.com");
            default:
                System.out.println("Invalid class name");
                return null;
        }
    }
}