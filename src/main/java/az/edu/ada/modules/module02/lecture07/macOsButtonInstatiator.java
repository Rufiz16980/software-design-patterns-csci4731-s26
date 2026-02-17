package az.edu.ada.modules.module02.lecture07;

public class macOsButtonInstatiator extends ButtonInstatiator{
    @Override
    public Button createButton() {
        return new macOsButton();
    }

    static public class macOsButton implements Button { 
        @Override 
        public void drawButton() { // because interface method was public
            System.err.println("circular macOsButton is activated");
        }
    }
}
