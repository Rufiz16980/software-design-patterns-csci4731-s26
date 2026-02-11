package az.edu.ada.modules.module02.lecture06;

public class FastCargoApp {
    public static void main(String[] args) {
        TransportDepo truckDepo = new TruckDepo();
        Transport myTruck = truckDepo.OrderTransport(); 

        TransportDepo trainDepo = new TrainDepo();
        Transport myTrain = trainDepo.OrderTransport(); 


    }
}

// video used: https://www.youtube.com/watch?v=EdFq_JIThqM
// how to run :
// javac src/main/java/az/edu/ada/modules/module02/lecture06/*.java
// java -cp src/main/java az.edu.ada.modules.module02.lecture06.FastCargoApp

// the sample output:
// Truck is loaded
// Train is loaded