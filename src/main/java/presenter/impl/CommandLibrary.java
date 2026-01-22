package presenter.impl;

import presenter.ICommand;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandLibrary {
    private final Map<String, ICommand> commands = new HashMap<>();

    public void registerCommand(String commandName, ICommand command) {
        commands.put(commandName, command);
    }

    public ICommand getCommand(String commandName) {
        ICommand command = commands.get(commandName);
        if (command == null) {
            throw new RuntimeException("No command with name " + commandName);
        }
        return command;
    }
}
