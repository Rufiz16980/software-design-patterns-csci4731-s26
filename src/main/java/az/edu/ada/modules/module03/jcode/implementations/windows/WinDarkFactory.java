package az.edu.ada.modules.module03.jcode.implementations.windows;

import az.edu.ada.modules.module03.jcode.components.Button;
import az.edu.ada.modules.module03.jcode.components.Checkbox;
import az.edu.ada.modules.module03.jcode.components.GUIFactory;
import az.edu.ada.modules.module03.jcode.components.ProgressBar;
import az.edu.ada.modules.module03.jcode.implementations.windows.products.WinDarkButton;
import az.edu.ada.modules.module03.jcode.implementations.windows.products.WinDarkCheckbox;
import az.edu.ada.modules.module03.jcode.implementations.windows.products.WinDarkProgressBar;

public class WinDarkFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinDarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinDarkCheckbox();
    }

    @Override
    public ProgressBar createProgressBar() {
        return new WinDarkProgressBar();
    }
}