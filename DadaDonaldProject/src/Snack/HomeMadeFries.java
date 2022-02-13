package Snack;

public class HomeMadeFries extends Snack{

    public HomeMadeFries(){
        avgPrepareTime=4;
        description="Homemade Fries";
    }

    @Override
    public double cost() {
        return 8;
    }
}
