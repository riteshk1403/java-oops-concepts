interface Payment {
    void pay();
}

class GooglePay implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment done using Google Pay");
    }
}

class PhonePe implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment done using PhonePe");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Payment p;

        p = new GooglePay();
        p.pay();

        p = new PhonePe();
        p.pay();
    }
}
