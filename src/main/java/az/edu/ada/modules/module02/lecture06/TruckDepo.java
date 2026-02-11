package az.edu.ada.modules.module02.lecture06;

public class TruckDepo extends TransportDepo {
    @Override
    public Transport InstantiateTransport() {
        return new Truck();
    }

    static public class Truck implements Transport {
        @Override 
        public void load () { // because interface method was public
            System.err.println("Truck is loaded");
        }
    }
}
