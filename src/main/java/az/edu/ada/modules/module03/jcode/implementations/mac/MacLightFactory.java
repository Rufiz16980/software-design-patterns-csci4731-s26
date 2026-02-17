package az.edu.ada.modules.module03.jcode.implementations.mac;

import az.edu.ada.modules.module03.jcode.components.Button;
import az.edu.ada.modules.module03.jcode.components.Checkbox;
import az.edu.ada.modules.module03.jcode.components.GUIFactory;
import az.edu.ada.modules.module03.jcode.components.ProgressBar;
import az.edu.ada.modules.module03.jcode.implementations.mac.products.MacLightButton;
import az.edu.ada.modules.module03.jcode.implementations.mac.products.MacLightCheckbox;
import az.edu.ada.modules.module03.jcode.implementations.mac.products.MacLightProgressBar;

public class MacLightFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacLightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacLightCheckbox();
    }

    @Override
    public ProgressBar createProgressBar() {
        return new MacLightProgressBar();
    }
}