package presenter.impl.widget;

import shared.Color;
import shared.Shape;
import shared.TextType;
import shared.Vector2;

import java.util.List;

public final class Label extends Widget {
    public Label(boolean active, String name, Shape shape, Color shapeColor,
                 String textId, Color textColor, TextType textType, List<String> textContext, Vector2 normalizedPosition) {
        super(active, name, shape, shapeColor, textId, textColor, textType, textContext, normalizedPosition);
    }
}