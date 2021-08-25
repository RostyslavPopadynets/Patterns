package BehaviourPatterns.Command;

import java.util.List;

// Приклад однієї із Команд до виконання
public class YouAsProjectManagerCommand implements Command {

    private Team team;
    private List<Requirement> requirements;

    public YouAsProjectManagerCommand(Team team, List<Requirement> requirements) {
        this.team = team;
        this.requirements = requirements;
    }
    public void execute() {
        // Реалізація делегує роботу до потрібного отримувача
        team.completeProject(requirements);
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }
}
