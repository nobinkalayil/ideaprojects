package ObjectOriented;

public class LoydsBank extends Bank {
    @Override
    public void bankLocation() {
        super.bankLocation();
    }

    @Override
    void current() {
        System.out.println("current Account");

    }

    void saving() {
        System.out.println("saving account");

    }

    @Override
    void businessAC() {
        System.out.println("Business account");
    }
}

