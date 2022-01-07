public class Main {
    public static void main(String[] args) {
        ITelephone pepsPhone;
        pepsPhone = new DeskPhone(2123456);
        pepsPhone.powerOn();
        pepsPhone.callPhone(2123456);
        pepsPhone.answer();

        System.out.println("=============");

        ITelephone didosPhone;
        didosPhone = new MobilePhone(2654321);
        didosPhone.callPhone(2654321);
        didosPhone.powerOn();
        didosPhone.callPhone(2654321);
        didosPhone.answer();
        didosPhone.dial(2123456);

    }
}
