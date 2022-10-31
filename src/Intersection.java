import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Intersection {
    private final int x;
    private final int y;

    Intersection(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override public boolean equals(Object o) {
        Intersection tempIntersection = (Intersection) o;
        if (this.x == tempIntersection.x && this.y == tempIntersection.y)
            return true;
        else
            return false;
    }

    public Intersection goNorth() {
        return new Intersection(x, y + 1);
    }

    public Intersection goSouth() {
        return new Intersection(x, y - 1);
    }

    public Intersection goEast() {
        return new Intersection(x + 1, y);
    }

    public Intersection goWest() {
        return new Intersection(x - 1, y);
    }

}
