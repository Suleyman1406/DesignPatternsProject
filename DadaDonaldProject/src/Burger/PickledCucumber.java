package Burger;

public class PickledCucumber extends BurgerAdditionDecorater {
    Burger burger;
    public PickledCucumber(Burger burger){
        this.burger=burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+ ", extra pickled Cucumber";
    }

    public double cost() {
        return 3+burger.cost();
    }
}
