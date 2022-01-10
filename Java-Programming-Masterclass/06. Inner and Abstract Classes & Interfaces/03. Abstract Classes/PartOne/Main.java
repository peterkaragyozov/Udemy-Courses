public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal("Gosho"); // Won't work, because we can't instantiate an abstract class
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        System.out.println("----------------");

        //Bird bird = new Bird("Parrot"); // Won't work, because we can't instantiate an abstract class
        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        System.out.println("----------------");

        Penguin penguin = new Penguin("Emperor Penguin");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
