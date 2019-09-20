package bitmap.transformer;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class Bitmap {
    public static void main(String[] args){
    }

    File bitMap = new File("../../../../assets/mario.bmp");

    BufferedImage mario;
    {
        try {
            mario = ImageIO.read(bitMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

