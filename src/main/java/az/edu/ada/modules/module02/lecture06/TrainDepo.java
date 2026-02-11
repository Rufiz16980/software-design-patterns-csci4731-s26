package az.edu.ada.modules.module02.lecture06;

public class TrainDepo extends TransportDepo {
    @Override
    public Transport InstantiateTransport() {
        return new Train();
    }

    static public class Train implements Transport { 
        @Override 
        public void load () { // because interface method was public
            System.err.println("Train is loaded");
        }
    }
    
}
