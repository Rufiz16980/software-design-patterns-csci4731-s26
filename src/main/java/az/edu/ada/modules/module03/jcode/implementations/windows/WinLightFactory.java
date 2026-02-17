package az.edu.ada.modules.module03.jcode.implementations.windows;

import az.edu.ada.modules.module03.jcode.components.Button;
import az.edu.ada.modules.module03.jcode.components.Checkbox;
import az.edu.ada.modules.module03.jcode.components.GUIFactory;
import az.edu.ada.modules.module03.jcode.components.ProgressBar;
import az.edu.ada.modules.module03.jcode.implementations.windows.products.WinLightButton;
import az.edu.ada.modules.module03.jcode.implementations.windows.products.WinLightCheckbox;
import az.edu.ada.modules.module03.jcode.implementations.windows.products.WinLightProgressBar;

public class WinLightFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinLightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinLightCheckbox();
    }

    @Override
    public ProgressBar createProgressBar() {
        return new WinLightProgressBar();
    }
}