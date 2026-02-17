package az.edu.ada.modules.module03.jcode.implementations.mac.products;

import az.edu.ada.modules.module03.jcode.components.ProgressBar;

public class MacLightProgressBar implements ProgressBar {
    private int value;

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void render() {
        System.out.println("Rendering [Mac Light] ProgressBar: Blue glossy bar. Value: " + value + "%");
    }
}