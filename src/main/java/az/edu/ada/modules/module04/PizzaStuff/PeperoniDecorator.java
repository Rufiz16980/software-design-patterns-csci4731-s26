package az.edu.ada.modules.module04.PizzaStuff;

public class PeperoniDecorator extends PizzaDecorator{
    public PeperoniDecorator(Pizza pizza){
        super(pizza);
    }

    public String prepare() {
        return pizza.prepare() + "with peperoni toppings";
    }
    
}
