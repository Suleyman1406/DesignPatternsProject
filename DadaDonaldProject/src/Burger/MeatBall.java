package Burger;

public class MeatBall extends BurgerAdditionDecorater {
    Burger burger;

    public MeatBall(Burger burger){
        this.burger=burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+ ", extra meatBall";
    }

    public double cost() {
        return 12+burger.cost();
    }
}
