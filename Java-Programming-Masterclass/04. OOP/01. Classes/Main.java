
public class Main {

	public static void main(String[] args) {

		// Car Challenge
		Car porsche = new Car();
		porsche.radio = true;

		porsche.setModel("Carrera");

		System.out.println(porsche.getModel());

		Car peugeot = new Car();
		peugeot.setEngine("brabra");
		System.out.println(peugeot.getEngine());
		peugeot.setEngine("DIESEL");
		System.out.println(peugeot.getEngine());
		
		System.out.println("************************************************");

		// Account Challenge
		Account bobsAccount = new Account();
		System.out.println(bobsAccount.getNumber());
		System.out.println(bobsAccount.getBalance());

		bobsAccount.withdrawal(100.0);

		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);

		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100.0);

		Account timsAccount = new Account("Tim", "tim@email.com", "12345");
		System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
		
		System.out.println("************************************************");
		
		//VIP Person Challenge
		VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

	}

}
