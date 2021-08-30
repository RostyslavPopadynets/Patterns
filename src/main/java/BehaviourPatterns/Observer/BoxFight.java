package BehaviourPatterns.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BoxFight implements Subject {

    private List<Observer> observerList;
    private Random random = new Random();

    private int boxerAScore;
    private int boxerBScore;

    public BoxFight() {
        observerList = new ArrayList<>();
    }

    @Override
    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

    public void nextRound() {
        boxerAScore += random.nextInt(5) + 1;
        boxerBScore += random.nextInt(5) + 1;
        notification();
    }

    public int getBoxerAScore() {
        return boxerAScore;
    }

    public int getBoxerBScore() {
        return boxerBScore;
    }
}
