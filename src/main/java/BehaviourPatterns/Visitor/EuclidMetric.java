package BehaviourPatterns.Visitor;

public class EuclidMetric implements Visitor {

    public double visit(Point2d p) {
        double x2 = p.getX() * p.getX();
        double y2 = p.getY() * p.getY();

        return Math.sqrt(x2 + y2);
    }

    public double visit(Point3d p) {
        double x2 = p.getX() * p.getX();
        double y2 = p.getY() * p.getY();
        double z2 = p.getZ() * p.getZ();

        return Math.sqrt(x2 + y2 + z2);
    }
}
