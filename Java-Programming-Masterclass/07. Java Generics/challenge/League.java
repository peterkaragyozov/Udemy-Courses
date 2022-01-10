package challenge;

import java.util.ArrayList;
import java.util.List;

public class League<T extends Team> {
    public String name;
    private final List<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team)) {
            return false;
        } else {
            this.league.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        System.out.println("--------------------");
        System.out.println(this.name);
        System.out.println("# RANKING - PTS #");
        System.out.println("--------------------");

        this.league
                .stream()
                .sorted()
                .forEach(e -> System.out.println(e.getName() + ": " + e.ranking()));

        System.out.println("--------------------");
    }
}
