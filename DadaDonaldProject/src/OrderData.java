import java.util.ArrayList;
import java.util.Timer;

public class OrderData implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Order> preparingOrders;
    private ArrayList<Order> preparedOrders;

    public OrderData(){
        observers=new ArrayList<>();
        preparingOrders=new ArrayList<>();
        preparedOrders=new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(preparingOrders,preparedOrders);
        }
    }

    public void addOrder(Order order){
        preparingOrders.add(order);
        notifyObservers();
        Timer t = new java.util.Timer();
        t.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        preparingOrders.remove(order);
                        preparedOrders.add(order);
                        notifyObservers();
                        t.cancel();
                    }
                },
                order.getAvgPrepareTime()* 1000L

        );
    }

}
