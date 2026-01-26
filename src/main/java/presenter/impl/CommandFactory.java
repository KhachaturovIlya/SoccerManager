package presenter.impl;

import presenter.impl.commands.action_commands.ChangeSceneCmd;
import presenter.impl.commands.action_commands.QuitCmd;
import presenter.impl.commands.action_commands.ShiftWidgetStateCmd;
import presenter.impl.commands.context_commands.TeamBudget;

public class CommandFactory {
    DefaultPresenter defaultPresenter;
    public CommandFactory(DefaultPresenter defaultPresenter) {
        this.defaultPresenter = defaultPresenter;
    }

    public CommandLibrary createCommandLibrary() {
        CommandLibrary commandLibrary = new CommandLibrary();

        commandLibrary.registerCommand("EXIT",
            new QuitCmd(defaultPresenter)
        );

        commandLibrary.registerCommand("SHIFT_WIDGET_STATE",
            new ShiftWidgetStateCmd(defaultPresenter)
        );


        commandLibrary.registerCommand("LOAD_NEW_SCENE",
            new ChangeSceneCmd(defaultPresenter)
        );

        commandLibrary.registerContextCommand("TEAM_BUDGET",
            new TeamBudget(defaultPresenter));

        return commandLibrary;
    }
}
