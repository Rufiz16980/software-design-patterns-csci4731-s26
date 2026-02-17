package az.edu.ada.modules.module02.lecture07;

import az.edu.ada.modules.module02.lecture06.TrainDepo;
import az.edu.ada.modules.module02.lecture06.Transport;
import az.edu.ada.modules.module02.lecture06.TransportDepo;

public class myApp {
    public static void main(String[] args) {
        ButtonInstatiator windowsButton = new windowsButtonInstatiator();
        ButtonInstatiator macOsButton = new macOsButtonInstatiator()

        windowsButton.instantiateButton();
        macOsButton.instantiateButton();


        checkBoxInstatiator windowsCheckBox = new windowsCheckBoxInstatiator();
        checkBoxInstatiator macOsCheckBox = new macOsCheckBoxInstatiator();

        windowsCheckBox.createCheckBox();
        macOsCheckBox.createCheckBox();
    }
    
}
