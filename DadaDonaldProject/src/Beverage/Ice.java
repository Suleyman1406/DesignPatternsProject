package Beverage;

public class Ice extends BeverageAdditionDecorater{
    Beverage beverage;

    public Ice(Beverage  beverage){
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"with ice";
    }
}
