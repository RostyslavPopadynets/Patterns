package BehaviourPatterns.Memento;

public class GameOriginator {

    // Стан містить здоров’я та к-ть вбитих монстрів
    private GameState state = new GameState(100, 0);

    public void play() {
        // Імітуємо процес гри –
        // здоров’я повільно погіршується, а монстрів стає все менше
        System.out.println(state);
        state = new GameState((int)(state.getHealth()*0.9), state.getKilledMonsters() + 2);
    }

    public GameMemento saveGame() {
        return new GameMemento(state);
    }

    public void loadGame(GameMemento memento) {
        state = memento.getState();
    }

}
