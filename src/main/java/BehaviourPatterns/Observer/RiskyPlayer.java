package BehaviourPatterns.Observer;

public class RiskyPlayer implements Observer {

    @Override
    public void update(Subject subject) {
        BoxFight boxFight = (BoxFight) subject;
        if (boxFight.getBoxerAScore() > boxFight.getBoxerBScore()) {
            System.out.println("RISKY PLAYER: I put on boxer B, if he win I get more!");
        } else {
            System.out.println("RISKY PLAYER: I put on boxer A, if he win I get more!");
        }
    }
}
