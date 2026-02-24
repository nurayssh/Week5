package cafe;

public class Snack extends MenuItem{
public Snack( String name, double price){
    super(name, price);
}

public void serve () {
    System.out.println("Serving snack: " + getName());


}
    }





