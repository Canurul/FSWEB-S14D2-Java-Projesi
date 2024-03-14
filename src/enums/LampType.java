package enums;

public enum LampType {
    SMALL(2),
    NORMAL(5),
    BIG(10);
    int size;

    LampType(int size) {
        this.size = size;
    }
}
