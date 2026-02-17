package az.edu.ada.modules.module03.jcode;

import az.edu.ada.modules.module03.jcode.builder.Window;
import az.edu.ada.modules.module03.jcode.builder.WindowBuilder;
import az.edu.ada.modules.module03.jcode.components.GUIFactory;
import az.edu.ada.modules.module03.jcode.implementations.windows.*;
import az.edu.ada.modules.module03.jcode.implementations.linux.*;
import az.edu.ada.modules.module03.jcode.implementations.mac.*;

import java.io.InputStream;
import java.util.Properties;

public class MainFinal {
    public static void main(String[] args) {
        GUIFactory factory = configureFactory();

        WindowBuilder builder = new WindowBuilder(factory);
        Window window = builder
            .addTitle("J-Code Final Production")
            .addButton("Submit Project")
            .addCheckbox("Tests Passed")
            .addProgressBar(100)
            .build();

        window.present();
    }

    private static GUIFactory configureFactory() {
        Properties config = new Properties();
        
        try (InputStream is = MainFinal.class.getResourceAsStream("config.properties")) {
            if (is == null) {
                System.out.println("Config not found in package, using default.");
                return new WinLightFactory();
            }
            config.load(is);
        } catch (Exception e) {
            return new WinLightFactory();
        }

        String os = config.getProperty("os", "windows").toLowerCase();
        String theme = config.getProperty("theme", "light").toLowerCase();

        System.out.println("System Initialized: " + os.toUpperCase() + " [" + theme.toUpperCase() + "]");

        if (os.equals("windows")) {
            return theme.equals("dark") ? new WinDarkFactory() : new WinLightFactory();
        } else if (os.equals("linux")) {
            return theme.equals("dark") ? new LinuxDarkFactory() : new LinuxLightFactory();
        } else if (os.equals("mac")) {
            return theme.equals("dark") ? new MacDarkFactory() : new MacLightFactory();
        }
        return new WinLightFactory();
    }
}


/*
# 1. Clean and Rebuild folder
Remove-Item -Recurse -Force .\out -ErrorAction SilentlyContinue; New-Item -ItemType Directory -Force -Path .\out

# 2. Compile everything WITH the library path
javac -cp "lib/*" -d .\out (Get-ChildItem -Recurse -Filter *.java .\src\main\java\az\edu\ada\modules\module03 | ForEach-Object FullName)

# 3. Create the package folder inside 'out' manually to be safe, then copy the config
New-Item -ItemType Directory -Force -Path ".\out\az\edu\ada\modules\module03\jcode\"
Copy-Item -Path ".\src\main\java\az\edu\ada\modules\module03\jcode\config.properties" -Destination ".\out\az\edu\ada\modules\module03\jcode\"

# 4. Run the Final version
java -cp .\out az.edu.ada.modules.module03.jcode.MainFinal

*/