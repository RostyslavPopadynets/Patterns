package BehaviourPatterns.Command;

public class Requirement {
    private String requirementName;
    private String requirementDescription;

    public Requirement(String requirementName, String requirementDescription) {
        this.requirementName = requirementName;
        this.requirementDescription = requirementDescription;
    }

    public String getRequirementName() {
        return this.requirementName;
    }

    public String getRequirementDescription() {
        return this.requirementDescription;
    }
}
