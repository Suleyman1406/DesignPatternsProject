package Snack;

public class LargeFries extends Snack{

    public LargeFries(){
        avgPrepareTime=2;
        description="Large Fries";
    }

    @Override
    public double cost() {
        return 9;
    }
}
