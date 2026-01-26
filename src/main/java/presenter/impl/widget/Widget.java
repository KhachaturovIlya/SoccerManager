package presenter.impl.widget;

import shared.Color;
import shared.Shape;
import shared.TextType;
import shared.Vector2;

import java.util.List;

public sealed abstract class Widget permits Button, Label, Container {
    static private int nextId = 0;

    final protected int id;
    protected String name;
    protected boolean active;

    final protected Shape shape;
    final protected Color shapeColor;

    final protected String textId;
    final protected Color textColor;
    final protected TextType textType;
    final protected List<String> TextContext;

    protected Vector2 normalizedPosition;

    public Widget(boolean active, String name, Shape shape, Color shapeColor,
                  String textId, Color textColor, TextType textType, List<String> textContext, Vector2 normalizedPosition) {
        this.id = nextId++;
        this.name = name;
        this.active = active;
        this.shape = shape;
        this.shapeColor = shapeColor;
        this.textId = textId;
        this.textColor = textColor;
        this.textType = textType;
        this.TextContext = textContext;
        this.normalizedPosition = normalizedPosition;
    }

    public int getId() {
        return id;
    }

    public boolean isActive() {
        return active;
    }

    public Shape getShape() {
        return shape;
    }

    public Color getShapeColor() {
        return shapeColor;
    }

    public String getName() {
        return name;
    }

    public String getTextId() {
        return textId;
    }

    public Color getTextColor() {
        return textColor;
    }

    public TextType getTextType() {
        return textType;
    }

    public List<String> getTextContext() {
        return TextContext;
    }

    public Vector2 getNormalizedPosition() {
        return normalizedPosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNormalizedPosition(Vector2 normalizedPosition) {
        this.normalizedPosition = normalizedPosition;
    }

    public void disable() {
        this.active = false;

    }
    public void enable() {
        this.active = true;
    }
}
