package BehaviourPatterns.Observer;

public class ConservativePlayer implements Observer {

    @Override
    public void update(Subject subject) {
        BoxFight boxFight = (BoxFight) subject;
        if (boxFight.getBoxerAScore() <= boxFight.getBoxerBScore()) {
            System.out.println("Conservative player: I put on boxer B, better be safe!");
        } else {
            System.out.println("Conservative player: I put on boxer A, better be safe!");
        }
    }
}
