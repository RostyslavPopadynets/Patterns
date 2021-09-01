package BehaviourPatterns.Visitor;

public interface Visitor {
    double visit(Point2d p);
    double visit(Point3d p);
}
