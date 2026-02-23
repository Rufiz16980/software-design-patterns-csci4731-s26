package az.edu.ada.modules.module03.facade_example;

import az.edu.ada.modules.module03.facade_example.CheckoutFacade;
import az.edu.ada.modules.module03.facade_example.backend.Cart;
import az.edu.ada.modules.module03.facade_example.backend.User;

public class Main {
    public static void main(String[] args) {
        Cart myCart = new Cart();
        User myUser = new User();

        CheckoutFacade checkout = new CheckoutFacade();

        checkout.placeOrder(myCart, myUser);
        System.out.println("Order placed");
    }
}