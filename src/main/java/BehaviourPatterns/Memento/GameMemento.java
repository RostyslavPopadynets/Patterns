package BehaviourPatterns.Memento;

/**
 * Цей клас може згенерувати екземпляр Хранителя із поточним
 * знімком (станом) гри, в той же час можна витягнути стан із уже існуючого
 * Хранителя, але, при цьому, ніхто більше не буде працювати із станом гри
 * напряму.
 */
public class GameMemento {

    private GameState state;

    public GameMemento(GameState state) {
        this.state = state;
    }
    public GameState getState() {
        return state;
    }


}
