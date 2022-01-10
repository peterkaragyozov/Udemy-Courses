public class Main {
    public static void main(String[] args) {
        BasketballPlayer tisho = new BasketballPlayer("Tishkata");
        VolleyballPlayer matei = new VolleyballPlayer("Matei Kaziyski");
        FootballPlayer berbo = new FootballPlayer("Dimitar Berbatov");
        FootballPlayer salah = new FootballPlayer("Mohammed Sallah");

        Team<FootballPlayer> liverpool = new Team<>("Liverpool FC");
        liverpool.addPlayer(salah);

        System.out.println(liverpool.numPlayers());

        Team<VolleyballPlayer> cskaVolley = new Team<>("CSKA Volley");
        cskaVolley.addPlayer(matei);

        Team<BasketballPlayer> lukoil = new Team<>("Lukoil Akademik");
        lukoil.addPlayer(tisho);

        Team<FootballPlayer> manUtd = new Team<>("Manchester Utd");
        manUtd.addPlayer(berbo);
        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        Team<FootballPlayer> arsenal = new Team<>("Arsenal");

        liverpool.matchResult(manUtd, 5, 0);
        liverpool.matchResult(arsenal, 3, 2);
        liverpool.matchResult(chelsea, 1, 2);
        arsenal.matchResult(liverpool, 1, 1);


        System.out.println(liverpool.ranking());

    }
}
