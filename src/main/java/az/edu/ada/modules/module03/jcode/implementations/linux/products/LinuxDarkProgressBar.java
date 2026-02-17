package az.edu.ada.modules.module03.jcode.implementations.linux.products;

import az.edu.ada.modules.module03.jcode.components.ProgressBar;

public class LinuxDarkProgressBar implements ProgressBar {
    private int value;

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void render() {
        System.out.println("Rendering [Linux Dark] ProgressBar: Red Arch-style bar. Value: " + value + "%");
    }
}