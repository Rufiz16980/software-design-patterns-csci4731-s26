package az.edu.ada.modules.module03.jcode;

import az.edu.ada.modules.module03.jcode.builder.Window;
import az.edu.ada.modules.module03.jcode.builder.WindowBuilder;
import az.edu.ada.modules.module03.jcode.components.GUIFactory;
import az.edu.ada.modules.module03.jcode.implementations.windows.WinLightFactory;
import az.edu.ada.modules.module03.jcode.implementations.linux.LinuxDarkFactory;
import az.edu.ada.modules.module03.jcode.implementations.mac.MacLightFactory;

public class Main {
    public static void main(String[] args) {
        
        GUIFactory currentOS;
        WindowBuilder builder;
        Window window;

        System.out.println("--- Booting up Windows System ---");
        currentOS = new WinLightFactory();
        
        builder = new WindowBuilder(currentOS);
        window = builder
            .addTitle("Windows Control Panel")
            .addButton("Update Drivers")
            .addCheckbox("Show Hidden Files")
            .addProgressBar(45)
            .build();
            
        window.present();
        System.out.println("\n"); 


        System.out.println("--- Switching to Linux Terminal ---");
        currentOS = new LinuxDarkFactory();
        
        builder = new WindowBuilder(currentOS);
        window = builder
            .addTitle("Root Terminal")
            .addButton("Compile Kernel")
            .addCheckbox("Verbose Mode")
            .addProgressBar(99)
            .build();
            
        window.present();
        System.out.println("\n"); 


        System.out.println("--- Launching macOS Interface ---");
        currentOS = new MacLightFactory();
        
        builder = new WindowBuilder(currentOS);
        window = builder
            .addTitle("System Preferences")
            .addButton("Back up to iCloud")
            .addCheckbox("Reduce Motion")
            .addProgressBar(20)
            .build();
            
        window.present();
    }
}


/*

Remove-Item -Recurse -Force .\out -ErrorAction SilentlyContinue; `
New-Item -ItemType Directory -Force -Path .\out; `
javac -d .\out (Get-ChildItem -Recurse -Filter *.java .\src\main\java\az\edu\ada\modules\module03 | ForEach-Object FullName); `
java -cp .\out az.edu.ada.modules.module03.jcode.Main

*/