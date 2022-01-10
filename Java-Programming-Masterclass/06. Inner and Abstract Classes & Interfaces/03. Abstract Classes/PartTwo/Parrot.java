public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking fruit seeds");
    }
}
