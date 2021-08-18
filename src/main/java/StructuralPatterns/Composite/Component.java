package StructuralPatterns.Composite;

public interface Component {
    public void add(Component c);
    public void remove(Component c);
    public void draw();
}
