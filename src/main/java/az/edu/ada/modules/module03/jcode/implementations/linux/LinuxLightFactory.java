package az.edu.ada.modules.module03.jcode.implementations.linux;

import az.edu.ada.modules.module03.jcode.components.Button;
import az.edu.ada.modules.module03.jcode.components.Checkbox;
import az.edu.ada.modules.module03.jcode.components.GUIFactory;
import az.edu.ada.modules.module03.jcode.components.ProgressBar;
import az.edu.ada.modules.module03.jcode.implementations.linux.products.LinuxLightButton;
import az.edu.ada.modules.module03.jcode.implementations.linux.products.LinuxLightCheckbox;
import az.edu.ada.modules.module03.jcode.implementations.linux.products.LinuxLightProgressBar;

public class LinuxLightFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxLightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxLightCheckbox();
    }

    @Override
    public ProgressBar createProgressBar() {
        return new LinuxLightProgressBar();
    }
}