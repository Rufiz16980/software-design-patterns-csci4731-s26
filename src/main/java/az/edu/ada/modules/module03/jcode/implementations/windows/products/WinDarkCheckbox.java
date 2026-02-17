package az.edu.ada.modules.module03.jcode.implementations.windows.products;

import az.edu.ada.modules.module03.jcode.components.Checkbox;

public class WinDarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering [Windows Dark] Checkbox: Dark box with light check.");
    }
}