import java.util.LinkedList;

public class CustomStack {
    static class MyStack<T> {
        LinkedList<T> elements = new LinkedList<>();

        boolean isEmpty() {
            return this.elements.isEmpty();
        }

        void push(T element) {
            this.elements.add(element);
        }

        T pop() {
            T last = this.elements.getLast();
            this.elements.removeLast();
            return last;
        }
    }

    public static void main(String[] args) {
        MyStack<String> names = new MyStack<>();

        names.push("joro");
        names.push("pesho");
        names.push("misho");

        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
    }
}
