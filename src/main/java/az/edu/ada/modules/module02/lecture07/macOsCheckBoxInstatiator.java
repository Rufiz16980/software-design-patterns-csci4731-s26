package az.edu.ada.modules.module02.lecture07;

public class macOsCheckBoxInstatiator extends checkBoxInstatiator{
    @Override
    public checkBox createCheckBox() {
        return new macOsCheckBox();
    }

    static public class macOsCheckBox implements checkBox { 
        @Override 
        public void mark() { // because interface method was public
            System.err.println("macOsButton is activate");
        }
    }
}
