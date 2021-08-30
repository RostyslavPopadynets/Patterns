package BehaviourPatterns.Memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {

    private GameOriginator game = new GameOriginator();
    private Deque<GameMemento> quickSaves = new ArrayDeque<>();

    public void shootThatDumbAss() {
        game.play();
    }

    public void save() {
        quickSaves.offer(game.saveGame());
    }
    public void load() {
        game.loadGame(quickSaves.getLast());
    }


}
