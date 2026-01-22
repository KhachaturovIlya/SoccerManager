package presenter.impl.widget;

import shared.Color;
import shared.Shape;
import shared.Vector2;

public sealed abstract class Widget permits Button, Label, Container {
    static private int nextId = 0;

    final protected int id;
    protected String name;
    protected boolean active;

    final protected Shape shape;
    final protected Color shapeColor;
    
    final protected Color textColor;

    final protected Vector2 normalizedPosition;

    public Widget(boolean active, String name, Shape shape, Color shapeColor,
                  Color textColor, Vector2 normalizedPosition) {
        this.id = nextId++;
        this.active = active;
        this.shape = shape;
        this.shapeColor = shapeColor;
        this.name = name;
        this.textColor = textColor;
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

    public Color getTextColor() {
        return textColor;
    }

    public Vector2 getNormalizedPosition() {
        return normalizedPosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void disable() {
        this.active = false;

    }
    public void enable() {
        this.active = true;
    }
}
