package BehaviourPatterns.Command;

public class Requirement {
    private String requirementName;
    private String requirementDescription;

    public Requirement(String requirementName, String requirementDescription) {
        this.requirementName = requirementName;
        this.requirementDescription = requirementDescription;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getRequirementDescription() {
        return requirementDescription;
    }

    public void setRequirementDescription(String requirementDescription) {
        this.requirementDescription = requirementDescription;
    }
}
