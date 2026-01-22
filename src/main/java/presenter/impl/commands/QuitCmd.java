package presenter.impl.commands;

import presenter.impl.DefaultPresenter;
import presenter.ICommand;

import java.util.List;

public class QuitCmd extends Command {
    public QuitCmd(DefaultPresenter defaultPresenter) throws Exception {
        super(defaultPresenter);
    }

    @Override
    public void execute(List<String> contextString) throws Exception {
        defaultPresenter.shutdown();
    }
}
