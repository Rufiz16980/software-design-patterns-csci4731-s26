package az.edu.ada.modules.module03.jcode.implementations.mac.products;

import az.edu.ada.modules.module03.jcode.components.Checkbox;

public class MacLightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering [Mac Light] Checkbox: Standard macOS Blue check.");
    }
}