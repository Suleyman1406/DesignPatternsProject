package Snack;

public class MediumFries extends Snack{

    public MediumFries(){
        avgPrepareTime=2;
        description="Medium Fries";
    }

    @Override
    public double cost() {
        return 7;
    }
}
