package az.edu.ada.modules.module02.lecture5;

import java.util.ArrayList;
import java.util.List;

public class Dragon implements Cloneable {

    private String name;
    private String color;
    private byte[] texture;

    public Dragon(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void loadTexture() throws InterruptedException {
        System.out.println("Loading texture 2 seconds");
        Thread.sleep(2000);
        texture = new byte[10]; 
    }

    @Override
    public Dragon clone() {
        try {
            Dragon clone = (Dragon) super.clone();
            if (this.texture != null) {
                clone.texture = this.texture.clone();
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Dragon: " + name + " (" + color + ")";
    }

    public static void main(String[] args) throws InterruptedException {
        Dragon prototype = new Dragon("BigBad", "Red");
        prototype.loadTexture();

        List<Dragon> army = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 10; i++) {
            Dragon clone = prototype.clone();
            clone.name = "OtherOne" + i; 
            army.add(clone);
            System.out.println("Created: " + clone);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("10 dragons: " + (endTime - startTime) + "ms");
    }
}

