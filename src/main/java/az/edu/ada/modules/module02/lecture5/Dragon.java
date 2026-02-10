package az.edu.ada.modules.module02.lecture5;

import java.util.Arrays;

public class Dragon implements Cloneable {

    private String name;
    private String color;
    private byte[] texture;

    public Dragon(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void loadTexture() throws InterruptedException {
        System.out.println("Loading texture");
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
        Dragon proto = new Dragon("BigBad", "red");
        proto.loadTexture();

        Dragon clone = proto.clone();

        System.out.println("Original: " + proto);
        System.out.println("Clone: " + clone);
        System.out.println("Distinct Objects: " + (proto != clone));
        System.out.println("Shared Data values: " + Arrays.equals(proto.texture, clone.texture));
    }
}