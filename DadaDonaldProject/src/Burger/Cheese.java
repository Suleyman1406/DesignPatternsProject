package Burger;

public class Cheese extends BurgerAdditionDecorater {
    Burger burger;
    public Cheese(Burger burger){
        this.burger=burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+ ", extra cheese";
    }

    public double cost() {
        return 4+burger.cost();
    }
}
