package day_069_mrt;

import java.util.ArrayList;
import java.util.List;

public class C182 {
    public static void main(String[] args) {

        Playable p = new Game(); //pollymorphism
        List<Player> players = new ArrayList<>();
        p.setPlayers(players);
        p.play();
    }
}
class Player {
}

interface Playable { // abstraction
    public void play();

    public void setPlayers(List<Player> players);
}

class Game implements Playable { // abstraction
    private List<Player> players; //encapsulation

    public List<Player> getPlayers() {
        return players;

    }

    public void setPlayers(List<Player> players) {
        this.players = players;

    }

    public void play() {
        System.out.println("Played");
    }

}
// cevap= A(Polymorphism,abstraction,and encapsulation are implemented

