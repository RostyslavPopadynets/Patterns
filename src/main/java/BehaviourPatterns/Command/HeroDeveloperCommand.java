package BehaviourPatterns.Command;

public class HeroDeveloperCommand implements Command {

    private HeroDeveloper heroDeveloper;
    private String projectName;

    public HeroDeveloperCommand(HeroDeveloper heroDeveloper, String projectName) {
        this.heroDeveloper = heroDeveloper;
        this.projectName = projectName;
    }
    public void execute() {
        // Реалізація делегує роботу до потрібного отримувача
        HeroDeveloper.doAllHardWork(heroDeveloper.getDeveloperName(), projectName);
    }
}
