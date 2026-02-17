package az.edu.ada.modules.module03.jcode.implementations.windows.products;

import az.edu.ada.modules.module03.jcode.components.Button;

public class WinLightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering [Windows Light] Button: Standard Blue/White style.");
    }
}