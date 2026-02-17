package az.edu.ada.modules.module03.jcode.builder;

import az.edu.ada.modules.module03.jcode.components.Button;
import az.edu.ada.modules.module03.jcode.components.Checkbox;
import az.edu.ada.modules.module03.jcode.components.GUIFactory;
import az.edu.ada.modules.module03.jcode.components.ProgressBar;

public class WindowBuilder {
    private GUIFactory factory;
    private Window window;

    public WindowBuilder(GUIFactory factory) {
        this.factory = factory;
        this.window = new Window();
    }

    public WindowBuilder addTitle(String title) {
        window.addComponent("=== " + title + " ===");
        return this;
    }

    public WindowBuilder addButton(String text) {
        window.addComponent(text); // Add text as a label above the button
        Button btn = factory.createButton();
        window.addComponent(btn);
        return this;
    }

    public WindowBuilder addCheckbox(String text) {
        window.addComponent(text); // Add text as a label
        Checkbox chk = factory.createCheckbox();
        window.addComponent(chk);
        return this;
    }

    public WindowBuilder addProgressBar(int initialValue) {
        ProgressBar bar = factory.createProgressBar();
        bar.setValue(initialValue);
        window.addComponent(bar);
        return this;
    }

    public Window build() {
        return this.window;
    }
}