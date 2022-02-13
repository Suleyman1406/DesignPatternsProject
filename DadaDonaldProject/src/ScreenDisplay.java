import java.util.ArrayList;

public abstract class ScreenDisplay {
    public ArrayList<Order> preparingOrders;
    public ArrayList<Order> preparedOrders;
    public String displayStringName;

    public void display(){
        System.out.print(displayStringName+":\nPreparing Order Numbers: ");
        for (Order o : preparingOrders) {
            System.out.print(o.getId()+", ");
        }
        System.out.println();
        System.out.print("Prepared Order Numbers: ");
        for (Order o : preparedOrders) {
            System.out.print(o.getId()+", ");
        }
        System.out.println();

    }

}
