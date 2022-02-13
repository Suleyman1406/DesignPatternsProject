public class SpecialDaBurgerMenu extends DaMenu{
    IDaMenuFactory daMenuFactory;

    public SpecialDaBurgerMenu(IDaMenuFactory daMenuFactory) {
        this.daMenuFactory = daMenuFactory;
    }

    @Override
    void prepare() {
        burger=daMenuFactory.createBurger();
        beverage=daMenuFactory.createBeverage();
        snack=daMenuFactory.createSnack();
        sauce=daMenuFactory.createSauce();
        cost=cost();
        avgPrepareTime=23;
    }

    @Override
    public double cost() {
        return 34.99;
    }

    @Override
    public String getDescription() {
        return "Special Da Burger Menu";
    }
}
