package bitmap.transformer;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import javax.imageio.ImageIO;



public class Bitmap {
    public static void main(String[] args)throws IOException {
        int width = 963; //width of the image
        int height = 640; //height of the image
        BufferedImage image;
        File f = null;

        //read and write the image file
        try {
            f = new File("assets/mario.bmp");
            image = ImageIO.read(f);
            System.out.println("Reading complete.");
            f = new File("assets/greenMario.bpm");
            ImageIO.write(image, "jpg", f);
            System.out.println("Writing complete.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Victory!");
    }
}

