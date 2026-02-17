package az.edu.ada.modules.module03.jcode.implementations.mac.products;

import az.edu.ada.modules.module03.jcode.components.ProgressBar;

public class MacDarkProgressBar implements ProgressBar {
    private int value;

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void render() {
        System.out.println("Rendering [Mac Dark] ProgressBar: Dark grey bar with white outline. Value: " + value + "%");
    }
}