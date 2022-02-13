package Snack;

public class BlackPepper extends  SnackAdditionDecorater{
    Snack snack;

    public BlackPepper(Snack snack){
        this.snack=snack;
    }

    @Override
    public String getDescription() {
        return snack.getDescription()+ ", extra black pepper";
    }

    public double cost() {
        return snack.cost();
    }
}
