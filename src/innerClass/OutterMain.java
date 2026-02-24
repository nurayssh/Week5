package innerClass;

public class OutterMain {
    public static void main(String[] args) {

    OutterCl outterObject = new OutterCl();
    OutterCl.InnerClass innerObject =  outterObject.new InnerClass();
    System.out.println( outterObject.x* innerObject.y);

}
    }
