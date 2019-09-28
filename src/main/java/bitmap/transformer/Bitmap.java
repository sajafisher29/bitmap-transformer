package bitmap.transformer;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

//Reference material: https://www.youtube.com/watch?v=lGX0Gc6d51s&feature=youtu.be

//Write code to read in a bitmap file (hardcoded String)
//Write out that unchanged bitmap into a file with a different name (hardcoded String)

public class Bitmap {

    public static void main(String[] args)throws IOException {

        //Create Bitmap class with constructor and instance method to write out image data

        int width = 963; //width of the image
        int height = 640; //height of the image
        BufferedImage image;
        File f = null;

        //Read and write the image file
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

    //Reference material: https://www.dyclassroom.com/image-processing-project/how-to-get-and-set-pixel-value-in-java
    //Write a transform method (set every red pixel to green)
    //Add a second transform to try a second transformation

    public static void pixelManipulator(String colorWanted, String colorToChange, String imagePath) {
        File path = new File(imagePath);
        try {
            BufferedImage img = ImageIO.read(path);
        } catch (IOException e) {
            System.out.println(imagePath + "Does not exist");
            e.printStackTrace();
        }
        int p = image.getRGB();

    }
}

