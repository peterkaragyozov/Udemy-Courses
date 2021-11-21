
public class VipPerson {
	private String name;
    private double creditLimit;
    private String emailAddress;

    
    //the first two constructors call the third constructor 
    public VipPerson() {
        this("Default name", 50000.00, "default@email.com");
    }
    
    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    //the third constructor is actually the only one that saves the values into our fields
    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

}
