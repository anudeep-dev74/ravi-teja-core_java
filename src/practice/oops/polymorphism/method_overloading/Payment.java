package practice.oops.polymorphism.method_overloading;
class PaymentService{
    public void pay(double amount){
        System.out.println("Cash Payment : " + amount);
    }
    public void pay(String upiId, double amount){
        System.out.println("UPI Payment");
        System.out.println("enter the upi id : " + upiId);
        System.out.println("Amount is : " + amount);
    }
    public void pay(long creditCard, int cvv, double amount){
        System.out.println("Card Payment");
        System.out.println("enter the card number: " + creditCard);
        System.out.println("enter the cvv number: " + cvv);
        System.out.println("Amount is " + amount);
    }
}
public class Payment {
    static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.pay(1000);
        service.pay("anudeep@ybl", 2500);
        service.pay(123456789L, 499, 890);
    }
}
