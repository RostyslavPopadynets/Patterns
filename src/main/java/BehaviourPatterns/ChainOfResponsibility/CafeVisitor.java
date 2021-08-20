package BehaviourPatterns.ChainOfResponsibility;

public abstract class CafeVisitor {

    private CafeVisitor cafeVisitor;

    protected CafeVisitor(CafeVisitor cafeVisitor) {
        this.cafeVisitor = cafeVisitor;
    }

    public void handleFood(Food food)
    {
        // Якщо не в змозі подужати їжу, передаємо її ближчому другові
        if (cafeVisitor != null) {
            cafeVisitor.handleFood(food);
        }
    }

    public CafeVisitor getCafeVisitor() {
        return cafeVisitor;
    }
}
