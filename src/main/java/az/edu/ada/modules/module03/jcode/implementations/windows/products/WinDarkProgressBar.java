package az.edu.ada.modules.module03.jcode.implementations.windows.products;

import az.edu.ada.modules.module03.jcode.components.ProgressBar;

public class WinDarkProgressBar implements ProgressBar {
    private int value;

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void render() {
        System.out.println("Rendering [Windows Dark] ProgressBar: Green fill on Dark Grey background. Value: " + value + "%");
    }
}