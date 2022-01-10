public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is swallowing some fresh fish");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly, but I'm a really good swimmer");
    }
}
