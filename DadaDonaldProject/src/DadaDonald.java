import Beverage.DaCola;
import Beverage.Ice;
import Burger.Burger;
import Burger.DaBurger;
import Burger.OnionRings;
import Burger.Lettuce;


public class DadaDonald {
    static OrderData orderData;
    static DadaSafe safe;
    public static void main(String[] args) {
        safe=DadaSafe.getInstance();
        orderData=new OrderData();
        new TvScreenDisplay(orderData);

        Customer customer1=new Customer("Tom");
        customer1.addToCart(createMenu("SpecialDaBurgerMenu"));
        customer1.addToCart(new DaBurger());
        orderCustomerCart(customer1);


        Burger burger=new DaBurger();
        burger=new Lettuce(burger);
        burger=new OnionRings(burger);
        Customer customer2=new Customer("Tony");
        customer2.addToCart(burger);
        customer2.addToCart(new Ice(new DaCola()));
        orderCustomerCart(customer2);



        System.out.println(safe.getEarn());
    }
    public static void orderCustomerCart(Customer customer){
        Order order=new Order(customer);
        System.out.println("Your order is accepted Mr/Ms. "+customer.getName()+". Your order cost: "+Math.round(customer.getCartCost()*100)/100.0+"TL. Order number: "+order.getId());
        orderData.addOrder(order);
        safe.addOrder(order);
        customer.clearCart();
    }

    public static DaMenu createMenu(String menuName){
        DaMenu daMenu=null;
        IDaMenuFactory iDaMenuFactory =new SpecialDaMenuFactory();
        if (menuName.equals("SpecialDaBurgerMenu")){
            daMenu=new SpecialDaBurgerMenu(iDaMenuFactory);
            daMenu.prepare();
            daMenu.setName("Special Daburger Menu");
        }else if (menuName.equals("SpecialDaSnackMenu")){
            daMenu=new SpecialDaSnackMenu(iDaMenuFactory);
            daMenu.prepare();
            daMenu.setName("Special Dasnack Menu");
        }
        return  daMenu;
    }

}
