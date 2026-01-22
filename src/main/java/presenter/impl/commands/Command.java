package presenter.impl.commands;

import presenter.ICommand;
import presenter.impl.DefaultPresenter;

public abstract class Command implements ICommand {
    DefaultPresenter defaultPresenter;
    public Command(DefaultPresenter defaultPresenter) throws Exception {
        if (defaultPresenter == null) {
            throw new Exception("Presenter nod loaded");
        }
        this.defaultPresenter = defaultPresenter;
    }

}
