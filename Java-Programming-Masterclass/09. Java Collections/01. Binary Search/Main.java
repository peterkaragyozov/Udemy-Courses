public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("National Theatre", 8, 12);
        theatre.getSeats();

        check(theatre, "B13");
        check(theatre, "F08");
    }

    private static void check(Theatre theatre, String seat) {
        if(theatre.reserveSeat(seat)) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
