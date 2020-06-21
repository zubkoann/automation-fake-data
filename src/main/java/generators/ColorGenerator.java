package generators;

import api.Generator;

import java.util.Random;
import java.awt.Color;

public class ColorGenerator implements Generator {
    public Color generate() {
        Random r = new Random();
        int red = r.nextInt(256);
        int green = r.nextInt(256);
        int blue = r.nextInt(256);
        return new Color(red,green,blue);
    }
}
