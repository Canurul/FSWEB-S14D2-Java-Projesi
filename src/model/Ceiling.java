package model;

import enums.Paintcolor;

public class Ceiling {

    private int height;
    private Paintcolor paintedColor;

    public Ceiling(int height, Paintcolor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public Paintcolor getPaintedColor() {
        return paintedColor;
    }


}
