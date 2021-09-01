package BehaviourPatterns.Visitor;

public class Point2d extends Point {

    public Point2d (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double accept (Visitor v) {
        return v.visit(this);
    }

    private double x;
    public double getX () { return x; }

    private double y;
    public double getY () { return y; }
}
