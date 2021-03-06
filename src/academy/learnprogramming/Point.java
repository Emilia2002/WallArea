package academy.learnprogramming;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x, int y) {
        int xB = this.x;
        int yB = this.y;

        return Math.sqrt((xB - x) * (xB - x) + (yB - y) * (yB - y));
    }

    public double distance() {

        return  Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0-y));
    }

    public double distance(Point another) {

        int xB = another.x;
        int yB = another.y;

        return Math.sqrt((xB - this.x) * (xB - this.x) + (yB - this.y) * (yB - this.y));

    }
}
