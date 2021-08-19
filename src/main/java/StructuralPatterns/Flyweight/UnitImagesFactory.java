package StructuralPatterns.Flyweight;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

public class UnitImagesFactory {

    private static Map<String, Image> imageMap = new HashMap<>();
    private static final String DRAGON = "Dragon";
    private static final String GOBLIN = "Goblin";

    public static Image getDragonImage() {
        if (!imageMap.containsKey(DRAGON)) {
            try {
                BufferedImage dragonImage = ImageIO.read(
                        new File("src/main/resources/pictures/dragon.jpg"));
                imageMap.put(DRAGON, dragonImage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return imageMap.get(DRAGON);
    }

    public static Image getGoblinImage() {
        if (!imageMap.containsKey(GOBLIN)) {
            try {
                BufferedImage goblinImage = ImageIO.read(
                        new File("src/main/resources/pictures/goblin.jpg"));
                imageMap.put(GOBLIN, goblinImage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return imageMap.get(GOBLIN);
    }
}
