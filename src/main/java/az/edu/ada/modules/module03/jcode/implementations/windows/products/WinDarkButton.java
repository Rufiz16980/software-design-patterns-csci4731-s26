package az.edu.ada.modules.module03.jcode.implementations.windows.products;

import az.edu.ada.modules.module03.jcode.components.Button;

public class WinDarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering [Windows Dark] Button: Dark Grey/White text style.");
    }
}