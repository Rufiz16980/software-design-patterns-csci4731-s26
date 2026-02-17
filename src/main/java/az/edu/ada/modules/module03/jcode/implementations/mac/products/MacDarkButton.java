package az.edu.ada.modules.module03.jcode.implementations.mac.products;

import az.edu.ada.modules.module03.jcode.components.Button;

public class MacDarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering [Mac Dark] Button: Dark Grey Metal-style button.");
    }
}