package BehaviourPatterns.Command;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Command> commands;
    
    public Customer() {
        commands = new ArrayList<>();
    }
    
    public void AddCommand(Command command) {
        commands.add(command);
    }
    
    public void SignContractWithBoss() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void signContractWithBoss() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
