package az.edu.ada.modules.module03.jcode.implementations.mac;

import az.edu.ada.modules.module03.jcode.components.Button;
import az.edu.ada.modules.module03.jcode.components.Checkbox;
import az.edu.ada.modules.module03.jcode.components.GUIFactory;
import az.edu.ada.modules.module03.jcode.components.ProgressBar;
import az.edu.ada.modules.module03.jcode.implementations.mac.products.MacDarkButton;
import az.edu.ada.modules.module03.jcode.implementations.mac.products.MacDarkCheckbox;
import az.edu.ada.modules.module03.jcode.implementations.mac.products.MacDarkProgressBar;

public class MacDarkFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacDarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacDarkCheckbox();
    }

    @Override
    public ProgressBar createProgressBar() {
        return new MacDarkProgressBar();
    }
}