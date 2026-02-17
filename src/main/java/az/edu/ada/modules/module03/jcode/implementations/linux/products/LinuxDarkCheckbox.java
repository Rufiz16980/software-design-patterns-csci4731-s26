package az.edu.ada.modules.module03.jcode.implementations.linux.products;

import az.edu.ada.modules.module03.jcode.components.Checkbox;

public class LinuxDarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering [Linux Dark] Checkbox: Neon Green check mark.");
    }
}