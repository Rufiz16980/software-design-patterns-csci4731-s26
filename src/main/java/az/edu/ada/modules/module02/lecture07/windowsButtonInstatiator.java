package az.edu.ada.modules.module02.lecture07;

public class windowsButtonInstatiator extends ButtonInstatiator{
    @Override
    public Button createButton() {
        return new windowsButton();
    }

    static public class windowsButton implements Button { 
        @Override 
        public void drawButton() { // because interface method was public
            System.err.println("rectangular windowsButton is drawn");
        }
    }
}
