package az.edu.ada.modules.module02.lecture07;

public abstract class ButtonInstatiator {
    public Button instantiateButton() {
        Button button = createButton(); 
        button.activate();
        return button;
    }

    public abstract Button createButton();
}
