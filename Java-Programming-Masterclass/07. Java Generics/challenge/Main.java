package challenge;

import challenge.players.BasketballPlayer;
import challenge.players.FootballPlayer;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("Premier League");

        Team<FootballPlayer> liverpool = new Team<>("Liverpool FC");
        Team<FootballPlayer> chelsea = new Team<>("Chelsea FC");
        Team<FootballPlayer> arsenal = new Team<>("Arsenal FC");
        Team<FootballPlayer> manUtd = new Team<>("Manchester United FC");
        Team<FootballPlayer> manCity = new Team<>("Manchester City FC");
        Team<BasketballPlayer> lukoilAkademik = new Team<>("BK Lukoil Akademik");

        footballLeague.add(liverpool);
        footballLeague.add(chelsea);
        footballLeague.add(arsenal);
        footballLeague.add(manCity);
        footballLeague.add(manUtd);
        //footballLeague.add(lukoilAkademik);

        liverpool.matchResult(chelsea, 2, 2);
        liverpool.matchResult(arsenal, 3, 0);
        liverpool.matchResult(manUtd, 5, 0);
        liverpool.matchResult(manCity, 2, 3);
        manUtd.matchResult(chelsea, 1, 3);
        arsenal.matchResult(chelsea, 0, 0);

        footballLeague.showLeagueTable();

        FootballPlayer salah = new FootballPlayer("Mohammed Salah");
        FootballPlayer mane = new FootballPlayer("Sadio Mane");
        liverpool.addPlayer(salah);
        liverpool.addPlayer(mane);
        System.out.println(liverpool.numPlayers());
    }
}
