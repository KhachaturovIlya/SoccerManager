package presenter.impl.widget;

import presenter.ICommand;
import shared.*;

import java.util.List;

public final class Button extends Widget {
    private final List<String> clickActions;
    private final List<String> actionContext;

    public Button(boolean active, String name, Shape shape, Color shapeColor, TextConfig textConfig,
                  Vector2 normalizedPosition, List<String> clickActions, List<String> actionContext) {
        super(active, name, shape, shapeColor, textConfig, normalizedPosition);
        this.clickActions = clickActions;
        this.actionContext = actionContext;
    }

    public List<String> getClickActions() {
        return clickActions;
    }

    public List<String> getActionContext() {
        return actionContext;
    }
}
