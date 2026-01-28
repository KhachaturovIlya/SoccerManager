package presenter.impl.widget.dinamicContainerPolicies;

import presenter.impl.interfaces.ILayoutStrategy;
import presenter.impl.widget.Widget;
import shared.Vector2;

import java.util.List;

public class VerticalLayout implements ILayoutStrategy {
    final private double gap;
    final private double sideMargin;

    public VerticalLayout(double gap, double sideMargin) {
        this.gap = gap;
        this.sideMargin = sideMargin;
    }

    @Override
    public void apply(List<Widget> widgets, double areaWidth, double areaHeight) {
        double sumHeight = 0;
        for (Widget widget : widgets) {
            if (sumHeight + widget.getShape().getHeight() <= areaHeight) {
                widget.setNormalizedPosition(new Vector2(sideMargin, sideMargin + sumHeight));
                widget.enable();

                sumHeight += widget.getShape().getHeight();
                sumHeight += gap;
            } else {
                widget.disable();
            }
        }
    }
}
