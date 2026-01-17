package presenter.impl;

import shared.Color;
import shared.Shape;
import shared.Vector2;

import java.util.ArrayList;
import java.util.List;

public class Widget {
    // Fields:

    final private int id;
    private boolean active;

    final private Shape shape;
    final private Color shapeColor;

    final private String text;
    final private Color textColor;

    final private Vector2 normalizedPosition;

    private final List<Runnable> clickActions = new ArrayList<>();
    // Methods:

    private Widget(int id, Shape shape, Color shapeColor, String text,
        Color textColor, Vector2 normalizedPosition) {
        this.id = id;
        this.active = false;
        this.shape = shape;
        this.shapeColor = shapeColor;
        this.text = text;
        this.textColor = textColor;
        this.normalizedPosition = normalizedPosition;
    }

    public void addOnClick(Runnable action) {
        if (action != null) {
            this.clickActions.add(action);
        }
    }

    public void executeClick() {
        if (!active) return;

        for (Runnable action : clickActions) {
            action.run();
        }
    }

    public Widget(Widget other) {
        this.id = other.id;
        this.active = other.active;
        this.shape = other.shape;
        this.shapeColor = other.shapeColor;
        this.text = other.text;
        this.textColor = other.textColor;
        this.normalizedPosition = other.normalizedPosition;
    }

    public static Widget createButton(int id, Shape shape, Color color, Vector2 position) {
        return new Widget(id, shape, color, "", color, position);
    }

    public static Widget createLabel(Shape shape, Color shapeColor,
        String text, Color textColor, Vector2 position) {
        return new Widget(-1, shape, shapeColor, text, textColor, position);
    }

    public void sleep() {
        active = false;
    }

    public void awake() {
        active = true;
    }

    // Getters:

    public boolean isActive() {
        return active;
    }

    public int getId() {
        return id;
    }

    public Shape getShape() {
        return shape;
    }

    public Color getShapeColor() {
        return shapeColor;
    }

    public String getText() {
        return text;
    }

    public Color getTextColor() {
        return textColor;
    }

    public Vector2 getNormalizedPosition() {
        return normalizedPosition;
    }
}
