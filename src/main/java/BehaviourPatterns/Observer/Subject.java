package BehaviourPatterns.Observer;

// Бійка, на яку спостерігачі ставлять гроші, є суб’єктом споглядання
public interface Subject {
    void attachObserver(Observer observer);
    void detachObserver(Observer observer);
    void notification();
}
