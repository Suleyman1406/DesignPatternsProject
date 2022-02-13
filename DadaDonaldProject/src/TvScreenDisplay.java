import java.util.ArrayList;

public class TvScreenDisplay extends ScreenDisplay implements Observer{
    int preparedOrderCount;
    public TvScreenDisplay(Subject orderData) {
        orderData.registerObserver(this);
        preparingOrders=new ArrayList<>();
        preparedOrders=new ArrayList<>();
        preparedOrderCount=0;
        displayStringName="Tv Screen";
    }

    @Override
    public void update(ArrayList<Order> preparingOrders, ArrayList<Order> preparedOrders) {
        this.preparingOrders=preparingOrders;
        this.preparedOrders=preparedOrders;
        if (preparedOrders.size()>preparedOrderCount){
            Order o=preparedOrders.get(preparedOrders.size()-1);
            readyOrderVoice(o.getId(),o.getCustomerName());
            preparedOrderCount=preparedOrders.size();
        }
        display();
    }

    public void readyOrderVoice(int readyOrderId,String customerName){
        System.out.println("Mr/Ms. "+customerName+". Order number "+readyOrderId+" has been prepared.");
    }


}
