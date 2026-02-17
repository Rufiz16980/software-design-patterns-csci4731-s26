package az.edu.ada.modules.module02.lecture07;


public abstract class checkBoxInstatiator {
    public checkBox instantiateButton() {
        checkBox button = createCheckBox(); 
        button.drawCheckBox();
        return button;
    }

    protected abstract checkBox createCheckBox();

}