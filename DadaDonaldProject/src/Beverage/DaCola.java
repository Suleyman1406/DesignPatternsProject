package Beverage;

public class DaCola extends Beverage {

    public DaCola(){
        description="Cola";
    }

    @Override
    public double cost() {
        return 6;
    }

}
