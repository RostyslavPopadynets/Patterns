package BehaviourPatterns.Visitor;

public class ManhattanMetric implements Visitor {

    public double visit(Point2d p) {
        double ax = Math.abs(p.getX());
        double ay = Math.abs(p.getY());

        return ax + ay;
    }

    public double visit(Point3d p) {
        double ax = Math.abs(p.getX());
        double ay = Math.abs(p.getY());
        double az = Math.abs(p.getZ());

        return ax + ay + az;
    }
}
