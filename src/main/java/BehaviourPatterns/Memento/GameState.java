package BehaviourPatterns.Memento;

public class GameState {

    private int health;
    private int killedMonsters;

    public GameState(int health, int killedMonsters) {
        this.health = health;
        this.killedMonsters = killedMonsters;
    }

    public int getHealth() {
        return health;
    }

    public int getKilledMonsters() {
        return killedMonsters;
    }

    @Override
    public String toString() {
        return "Health: " + health +
                "\nKilled Monsters: " + killedMonsters;
    }
}
