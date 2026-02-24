package transport;

public class TransportInfo {
    public static void main(String[] args) {

        Transport transport = new Transport();

        Transport boat = new Boat();
        boat.transportAct();

        Transport plane = new Plane();
        plane.transportAct();

        Transport car = new Car();
        car.transportAct();
    }
}
