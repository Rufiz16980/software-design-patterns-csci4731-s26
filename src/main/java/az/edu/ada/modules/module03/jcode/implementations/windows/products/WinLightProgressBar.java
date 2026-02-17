package az.edu.ada.modules.module03.jcode.implementations.windows.products;

import az.edu.ada.modules.module03.jcode.components.ProgressBar;

public class WinLightProgressBar implements ProgressBar {
    private int value;

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void render() {
        System.out.println("Rendering [Windows Light] ProgressBar: Green fill on White background. Value: " + value + "%");
    }
}