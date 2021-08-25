package BehaviourPatterns.Command;

import java.util.List;

public class Team {
    private String teamName;
    private int teamMembersCount;

    public Team(String teamName, int teamMembersCount) {
        this.teamName = teamName;
        this.teamMembersCount = teamMembersCount;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamMembersCount() {
        return teamMembersCount;
    }

    public void setTeamMembersCount(int teamMembersCount) {
        this.teamMembersCount = teamMembersCount;
    }

    public void completeProject(List<Requirement> requirements) {
        for (Requirement requirement : requirements) {
            System.out.println("User Story : \"" + requirement.getRequirementName() + "\" is done.");
        }
    }
}
