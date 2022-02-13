package Beverage;

public class DiceTea extends Beverage {

    public DiceTea(){
        description="Ice Tea";
    }

    @Override
    public double cost() {
        return 5;
    }
}
