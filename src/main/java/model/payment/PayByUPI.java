package model.payment;

public class PayByUPI extends CashlessPayment{

    public PayByUPI() {
        super(PaymentCategory.UPI);
    }
}
