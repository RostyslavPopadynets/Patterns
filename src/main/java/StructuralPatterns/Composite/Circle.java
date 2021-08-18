package StructuralPatterns.Composite;

public class Circle implements Component{

    @Override
    public void add(Component c) {
        System.out.println("unsupported operation add for circle");
    }

    @Override
    public void remove(Component c) {
        System.out.println("unsupported operation remove for circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

}
