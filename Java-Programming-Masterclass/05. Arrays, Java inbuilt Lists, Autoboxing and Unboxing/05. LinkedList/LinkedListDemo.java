import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sofia");
        addInOrder(placesToVisit, "Ahtopol");
        addInOrder(placesToVisit, "Veliko Tarnovo");
        addInOrder(placesToVisit, "Stara Zagora");
        addInOrder(placesToVisit, "Vratza");
        addInOrder(placesToVisit, "Pernik");
        addInOrder(placesToVisit, "Burgas");
        addInOrder(placesToVisit, "Varna");
        addInOrder(placesToVisit, "Smolyan");
        addInOrder(placesToVisit, "Blagoevgrad");
        addInOrder(placesToVisit, "Vidin");
        addInOrder(placesToVisit, "Montana");
        addInOrder(placesToVisit, "Ruse");
        addInOrder(placesToVisit, "Silistra");
        addInOrder(placesToVisit, "Yambol");
        addInOrder(placesToVisit, "Dospat");
        addInOrder(placesToVisit, "Elin Pelin");
        addInOrder(placesToVisit, "Gabrovo");
        addInOrder(placesToVisit, "Haskovo");
        addInOrder(placesToVisit, "Ihtiman");
        addInOrder(placesToVisit, "Kotel");
        addInOrder(placesToVisit, "Lom");
        addInOrder(placesToVisit, "Nesebar");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Vidin");
        addInOrder(placesToVisit, "Plovdiv");

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                // new City should appear before this one
                // Ruse  -> Plovdiv
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday is over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("""
                0 - to quit
                1 - go to next city
                2 - go to previous city
                3 - print menu options""");
    }
}
