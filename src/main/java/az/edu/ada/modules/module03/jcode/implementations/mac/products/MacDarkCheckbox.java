package az.edu.ada.modules.module03.jcode.implementations.mac.products;

import az.edu.ada.modules.module03.jcode.components.Checkbox;

public class MacDarkCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering [Mac Dark] Checkbox: White check on dark background.");
    }
}