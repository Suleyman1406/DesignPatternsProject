package Snack;


public class Salt extends SnackAdditionDecorater{

    Snack snack;

    public Salt(Snack snack){
        this.snack=snack;
    }

    @Override
    public String getDescription() {
        return snack.getDescription()+ ", extra salt";
    }

    public double cost() {
        return snack.cost();
    }
}
