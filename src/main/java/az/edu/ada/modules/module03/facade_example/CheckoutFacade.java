package az.edu.ada.modules.module03.facade_example;

import az.edu.ada.modules.module03.facade_example.backend.*;

class CheckoutFacade {
    private InventorySystem inventory;
    private PaymentGateway payment;
    private ShippingService shipping;
    private NotificationService notification;

    public CheckoutFacade() {
        this.inventory = new InventorySystem();
        this.payment = new PaymentGateway();
        this.shipping = new ShippingService();
        this.notification = new NotificationService();
    }

    public void placeOrder(Cart cart, User user) {
        inventory.reserveItems(cart);
        payment.processCreditCard(user);
        shipping.calculateLogistics(cart);
        notification.emailReceipt(user);

        System.out.println("Checkout is complete");
    }
}