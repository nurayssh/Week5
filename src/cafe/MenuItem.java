package cafe;

public class MenuItem {
    private String name;
    private double price;
        // get set
    public MenuItem( String name, double price) {
        this.name =name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setName(String name) {

    }

    public void serve() {
         System.out.println("Serving menu item: " + name);

        }
        class PriceInfo {
        public void showPrice() {
            System.out.println(name +" costs: " + price);
        }




    }
}

