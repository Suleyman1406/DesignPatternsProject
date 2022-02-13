package Burger;


public class Lettuce extends BurgerAdditionDecorater {
    Burger burger;

    public Lettuce(Burger burger){
        this.burger=burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+ ", extra lettuce";
    }

    public double cost() {
        return 3+burger.cost();
    }
}