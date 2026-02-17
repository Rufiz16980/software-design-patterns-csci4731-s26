package az.edu.ada.modules.module03.jcode.builder;

import az.edu.ada.modules.module03.jcode.components.Button;
import az.edu.ada.modules.module03.jcode.components.Checkbox;
import az.edu.ada.modules.module03.jcode.components.ProgressBar;
import java.util.ArrayList;
import java.util.List;

public class Window {
    private List<Object> components = new ArrayList<>();

    public void addComponent(Object component) {
        components.add(component);
    }

    public void present() {
        System.out.println("--- Window Presentation ---");
        for (Object component : components) {
            if (component instanceof String) {
                System.out.println("LABEL: " + component);
            } else if (component instanceof Button) {
                ((Button) component).render();
            } else if (component instanceof Checkbox) {
                ((Checkbox) component).render();
            } else if (component instanceof ProgressBar) {
                ((ProgressBar) component).render();
            }
        }
        System.out.println("---------------------------");
    }
}