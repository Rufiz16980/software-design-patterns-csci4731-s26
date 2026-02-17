package az.edu.ada.modules.module03.jcode;

import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import az.edu.ada.modules.module03.jcode.builder.Window;
import az.edu.ada.modules.module03.jcode.builder.WindowBuilder;
import az.edu.ada.modules.module03.jcode.components.Button;
import az.edu.ada.modules.module03.jcode.components.GUIFactory;
import az.edu.ada.modules.module03.jcode.implementations.linux.LinuxDarkFactory;
import az.edu.ada.modules.module03.jcode.implementations.linux.products.LinuxDarkButton;
import az.edu.ada.modules.module03.jcode.implementations.windows.WinLightFactory;
import az.edu.ada.modules.module03.jcode.implementations.windows.products.WinLightButton;

import java.lang.reflect.Field;
import java.util.List;

public class JCodeTest {

    // --- TEST 1: Windows Factory Logic ---
    @Test
    void testWindowsFactoryCreatesWindowsButton() {
        System.out.println("Running Test: Windows Factory Logic...");
        GUIFactory factory = new WinLightFactory();
        Button btn = factory.createButton();

        // Assert that the button created is actually a WinLightButton
        assertTrue(btn instanceof WinLightButton, "WinLightFactory must create an instance of WinLightButton");
    }

    // --- TEST 2: Linux Factory Logic ---
    @Test
    void testLinuxFactoryCreatesLinuxButton() {
        System.out.println("Running Test: Linux Factory Logic...");
        GUIFactory factory = new LinuxDarkFactory();
        Button btn = factory.createButton();

        assertTrue(btn instanceof LinuxDarkButton, "LinuxDarkFactory must create an instance of LinuxDarkButton");
    }

    // --- TEST 3: Builder Logic (Counting Components) ---
    @Test
    void testBuilderAddsComponentsCorrectly() throws Exception {
        System.out.println("Running Test: Builder Logic...");
        
        GUIFactory factory = new WinLightFactory();
        WindowBuilder builder = new WindowBuilder(factory);

        // We add: 
        // 1. Title (1 item: String)
        // 2. Button (2 items: String Label + Button Object)
        // 3. Checkbox (2 items: String Label + Checkbox Object)
        // Total expected: 5 items in the list
        Window window = builder
            .addTitle("Test Window")
            .addButton("Click Me")
            .addCheckbox("Check Me")
            .build();

        // Reflection magic to check private list size
        Field field = Window.class.getDeclaredField("components");
        field.setAccessible(true);
        List<?> components = (List<?>) field.get(window);

        assertEquals(5, components.size(), "Window should contain exactly 5 component objects (Labels + Components)");
    }
}


/*

# 1. Clean
Remove-Item -Recurse -Force .\out -ErrorAction SilentlyContinue; New-Item -ItemType Directory -Force -Path .\out

# 2. Compile (Linking the lib folder)
javac -cp "lib/*" -d .\out (Get-ChildItem -Recurse -Filter *.java .\src\main\java\az\edu\ada\modules\module03 | ForEach-Object FullName)

# 3. Run
java -jar lib/junit-platform-console-standalone-1.10.0.jar -cp out -c az.edu.ada.modules.module03.jcode.JCodeTest

*/