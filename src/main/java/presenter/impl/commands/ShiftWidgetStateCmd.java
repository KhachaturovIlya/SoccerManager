package presenter.impl.commands;

import presenter.impl.DefaultPresenter;
import presenter.impl.widget.Widget;

import java.util.List;

public class ShiftWidgetStateCmd extends Command {
    public ShiftWidgetStateCmd(DefaultPresenter defaultPresenter) throws Exception {
        super(defaultPresenter);
    }

    @Override
    public void execute(List<String> contextString) throws Exception {
        for (String widgetId : contextString) {
            defaultPresenter.shiftWidgetState(widgetId);
        }
    }
}
