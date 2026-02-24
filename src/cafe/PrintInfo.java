package cafe;

public class PrintInfo {
    public static void main(String[] args) {

        MenuItem object1 = new Snack("KitKat", 150);
        MenuItem.PriceInfo price1 = object1.new PriceInfo();


        object1.serve();

        MenuItem object2 = new Coffee("latte", 125);
        MenuItem.PriceInfo price2 = object2.new PriceInfo();

        object2.serve();

        price1.showPrice();
        price2.showPrice();

        double all = object1.getPrice()+ object2.getPrice();
        System.out.println("Total: "+ all);
    }

}
