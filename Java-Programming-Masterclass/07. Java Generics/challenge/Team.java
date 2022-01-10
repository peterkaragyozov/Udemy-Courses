package challenge;

import challenge.players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private final List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
        } else {
            members.add(player);
            System.out.println(player.getName() + " transferred to team " + this.name);
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(Objects.nonNull(opponent)) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.ranking(), this.ranking());

        // {
        //        if (this.ranking() > team.ranking()) {
        //            return -1;
        //        } else if (this.ranking() < team.ranking()) {
        //            return 1;
        //        } else {
        //            return 0;
        //        }
        //    }
    }
}
