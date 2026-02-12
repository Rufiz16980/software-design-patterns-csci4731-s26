package az.edu.ada.modules.module02.lecture07;

public class windowsCheckBoxInstatiator extends checkBoxInstatiator{
    @Override
    public checkBox createCheckBox() {
        return new windowsCheckBox();
    }

    static public class windowsCheckBox implements checkBox { 
        @Override 
        public void mark() { // because interface method was public
            System.err.println("windowsButton is activate");
        }
    }
}
