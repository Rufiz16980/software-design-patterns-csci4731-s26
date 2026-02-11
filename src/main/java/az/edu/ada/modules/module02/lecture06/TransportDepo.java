package az.edu.ada.modules.module02.lecture06;

public abstract class TransportDepo {
    public Transport OrderTransport() {
        Transport transport = InstantiateTransport();
        transport.load();
        return transport;
    }

    public abstract Transport InstantiateTransport();
}
