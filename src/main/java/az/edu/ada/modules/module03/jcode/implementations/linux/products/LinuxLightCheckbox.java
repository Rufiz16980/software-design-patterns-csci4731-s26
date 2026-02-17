package az.edu.ada.modules.module03.jcode.implementations.linux.products;

import az.edu.ada.modules.module03.jcode.components.Checkbox;

public class LinuxLightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering [Linux Light] Checkbox: Simple square box.");
    }
}