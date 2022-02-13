import java.util.ArrayList;

public class CustomerScreenDisplay extends ScreenDisplay implements Observer {
    public CustomerScreenDisplay(Subject orderData,String customerName) {
        orderData.registerObserver(this);
        preparingOrders=new ArrayList<>();
        preparedOrders=new ArrayList<>();

        displayStringName="Mr/Ms. "+customerName+" screen";
    }

    @Override
    public void update(ArrayList<Order> preparingOrders, ArrayList<Order> preparedOrders) {
        this.preparingOrders=preparingOrders;
        this.preparedOrders=preparedOrders;
        display();
    }



}
