package ObjectOriented;

public class HSBC implements NewBank {
    @Override
    public void businessAC() {
        System.out.println("business account");
    }

    @Override
    public void current() {
        System.out.println("current account");
    }

    @Override
    public void saving() {
        System.out.println("saving ac");
    }

    @Override
    public void bankLocation() {
        System.out.println("London");
    }

    public static void main(String[] args) {
        HSBC hsbc = new HSBC();
        hsbc.saving();
        hsbc.businessAC();
        hsbc.current();
        hsbc.bankLocation();
    }
}
