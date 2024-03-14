package model;

import enums.Paintcolor;

public class Carpet {
    private int witdh;
    private int height;
    private Paintcolor color;

    public Carpet(int witdh, int height, Paintcolor color) {
        this.witdh = witdh;
        this.height = height;
        this.color = color;
    }

    public int getWitdh() {
        return witdh;
    }

    public int getHeight() {
        return height;
    }

    public Paintcolor getColor() {
        return color;
    }
    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
