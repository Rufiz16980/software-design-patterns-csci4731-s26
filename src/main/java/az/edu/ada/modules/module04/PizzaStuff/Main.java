package az.edu.ada.modules.module04.PizzaStuff;

public class Main {
    Pizza pizza = new RealPizza();
    pizza = new PeperoniDecorator(pizza);
    System.out.println(pizza.prepare());

    
}
