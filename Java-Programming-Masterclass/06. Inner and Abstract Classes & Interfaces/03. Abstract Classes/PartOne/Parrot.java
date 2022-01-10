public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking fruit seeds");
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
