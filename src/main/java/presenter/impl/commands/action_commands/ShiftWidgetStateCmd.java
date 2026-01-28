package presenter.impl.commands.action_commands;

import presenter.impl.DefaultPresenter;

import java.util.List;

public class ShiftWidgetStateCmd extends Command {
    public ShiftWidgetStateCmd(DefaultPresenter defaultPresenter) {
        super(defaultPresenter);
    }

    @Override
    public void execute(List<String> contextString) throws Exception {
        for (String widgetId : contextString) {
            defaultPresenter.shiftWidgetState(widgetId);
        }
    }
}
