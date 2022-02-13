package Snack;

public class SmallFries extends Snack{

    public SmallFries(){
        avgPrepareTime=2;
        description="Small Fries";
    }

    @Override
    public double cost() {
        return 5;
    }
}
