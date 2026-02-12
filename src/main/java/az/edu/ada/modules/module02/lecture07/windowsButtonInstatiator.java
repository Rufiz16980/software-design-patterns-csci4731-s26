package az.edu.ada.modules.module02.lecture07;

public class windowsButtonInstatiator extends ButtonInstatiator{
    @Override
    public Button createButton() {
        return new windowsButton();
    }

    static public class windowsButton implements Button { 
        @Override 
        public void activate() { // because interface method was public
            System.err.println("windowsButton is activate");
        }
    }
}
