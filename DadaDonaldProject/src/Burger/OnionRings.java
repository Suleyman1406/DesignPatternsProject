package Burger;

public class OnionRings extends BurgerAdditionDecorater {
    Burger burger;

    public OnionRings(Burger burger){
        this.burger=burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+ ", extra onion rings";
    }

    public double cost() {
        return 5+burger.cost();
    }
}
