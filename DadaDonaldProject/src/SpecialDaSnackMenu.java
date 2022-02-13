public class SpecialDaSnackMenu extends DaMenu{

    IDaMenuFactory daMenuFactory;

    public SpecialDaSnackMenu(IDaMenuFactory daMenuFactory) {
        this.daMenuFactory = daMenuFactory;
    }

    @Override
    void prepare() {
        beverage=daMenuFactory.createBeverage();
        snack=daMenuFactory.createSnack();
        sauce=daMenuFactory.createSauce();
        cost=cost();
        avgPrepareTime=6;
    }

    @Override
    public double cost() {
        return 9.99;
    }

    @Override
    public String getDescription() {
        return "Special Snack Menu";
    }
}
