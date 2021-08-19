package StructuralPatterns.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private List<Unit> units = new ArrayList<>();

    public List<Unit> getAllUnits() {
        for (int i = 0; i < 500; i++) {
            units.add(new Goblin());
        }
        for (int i = 0; i < 100; i++) {
            units.add(new Dragon());
        }
        return units;
    }

}
