package presenter.impl.widget.dinamicContainerPolicies;

import presenter.impl.interfaces.ILayoutStrategy;
import presenter.impl.widget.Widget;

import java.util.List;

public class StaticLayout implements ILayoutStrategy {
    @Override
    public void apply(List<Widget> widgets, double areaWidth, double areaHeight) {
        // State of widgets doesn't change.
    }
}
