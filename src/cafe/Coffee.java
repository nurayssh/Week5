package cafe;

public class Coffee extends MenuItem{
    public Coffee (String name, double price) {
        super(name, price);
    }
    public void serve () {
        System.out.println("Serving coffee: " + getName());

    }}