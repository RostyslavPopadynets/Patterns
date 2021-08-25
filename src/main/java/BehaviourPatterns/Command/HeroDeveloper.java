package BehaviourPatterns.Command;

public class HeroDeveloper {

    private String developerName;
    private String developerSkills;

    public HeroDeveloper(String developerName, String developerSkills) {
        this.developerName = developerName;
        this.developerSkills = developerSkills;
    }

    public static void doAllHardWork(String developerName, String projectName) {
        System.out.println("The work for project \"" + projectName + "\" is done by " + developerName + ".");
    }

    public String getDeveloperName() {
        return this.developerName;
    }

    public String getDeveloperSkills() {
        return this.developerSkills;
    }
}
