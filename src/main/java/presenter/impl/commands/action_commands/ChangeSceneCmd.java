package presenter.impl.commands.action_commands;

import presenter.impl.DefaultPresenter;

import java.util.List;

public class ChangeSceneCmd extends Command {
    public ChangeSceneCmd(DefaultPresenter defaultPresenter) {
        super(defaultPresenter);
    }

    @Override
    public void execute(List<String> contextString) throws Exception {
        for (String context : contextString) {
            defaultPresenter.loadNewScene(context);
        }
    }
}
