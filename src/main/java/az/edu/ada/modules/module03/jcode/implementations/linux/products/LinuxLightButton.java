package az.edu.ada.modules.module03.jcode.implementations.linux.products;

import az.edu.ada.modules.module03.jcode.components.Button;

public class LinuxLightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering [Linux Light] Button: Flat Gnome-style button.");
    }
}