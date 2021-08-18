package StructuralPatterns.Composite;

public class Rectangle implements Component {

    @Override
    public void add(Component c) {
        System.out.println("unsupported operation add for rectangle");
    }

    @Override
    public void remove(Component c) {
        System.out.println("unsupported operation remove for rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }

}
