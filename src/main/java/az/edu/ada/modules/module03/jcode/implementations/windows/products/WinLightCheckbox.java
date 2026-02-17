package az.edu.ada.modules.module03.jcode.implementations.windows.products;

import az.edu.ada.modules.module03.jcode.components.Checkbox;

public class WinLightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering [Windows Light] Checkbox: White box with black check.");
    }
}