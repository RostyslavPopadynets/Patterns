package BehaviourPatterns.Command;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Command> commands;
    
    public Customer() {
        commands = new ArrayList<>();
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
