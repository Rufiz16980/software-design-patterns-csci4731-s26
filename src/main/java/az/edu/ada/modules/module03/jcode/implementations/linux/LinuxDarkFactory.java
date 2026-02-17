package az.edu.ada.modules.module03.jcode.implementations.linux;

import az.edu.ada.modules.module03.jcode.components.Button;
import az.edu.ada.modules.module03.jcode.components.Checkbox;
import az.edu.ada.modules.module03.jcode.components.GUIFactory;
import az.edu.ada.modules.module03.jcode.components.ProgressBar;
import az.edu.ada.modules.module03.jcode.implementations.linux.products.LinuxDarkButton;
import az.edu.ada.modules.module03.jcode.implementations.linux.products.LinuxDarkCheckbox;
import az.edu.ada.modules.module03.jcode.implementations.linux.products.LinuxDarkProgressBar;

public class LinuxDarkFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxDarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxDarkCheckbox();
    }

    @Override
    public ProgressBar createProgressBar() {
        return new LinuxDarkProgressBar();
    }
}