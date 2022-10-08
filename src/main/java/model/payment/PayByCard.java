package model.payment;

public class PayByCard extends CashlessPayment{

    public PayByCard() {
        super(PaymentCategory.CARD);
    }
}
