package StructuralPatterns.Composite;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GroupComponent implements Component {

    private List<Component> listOfComponents;

    public GroupComponent(Component...components)
    {
        listOfComponents = new LinkedList<>();
        Collections.addAll(listOfComponents, components);
    }

    @Override
    public void add(Component c) {
        listOfComponents.add(c);
    }

    @Override
    public void remove(Component c) {
        listOfComponents.remove(c);
    }

    @Override
    public void draw() {
        for (Component component : listOfComponents) {
            component.draw();
        }
    }

}
