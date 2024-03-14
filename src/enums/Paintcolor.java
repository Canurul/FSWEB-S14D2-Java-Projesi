package enums;

public enum Paintcolor {
    RED("red"),
    BLUE("blue"),
    GREEN("green");
    private String color;

    Paintcolor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
