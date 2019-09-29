package bitmap.transformer;
import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

//Reference material: https://www.youtube.com/watch?v=lGX0Gc6d51s&feature=youtu.be

//Write code to read in a bitmap file (hardcoded String)
//Write out that unchanged bitmap into a file with a different name (hardcoded String)

//Reference material: https://www.dyclassroom.com/image-processing-project/how-to-get-and-set-pixel-value-in-java
//                    https://www.youtube.com/watch?v=lGX0Gc6d51s&feature=youtu.be

class Bitmap {

    //Create Bitmap class with constructor and instance method to write out image data

    //Instance variables

    private BufferedImage imageData;

    //Constructor
    public Bitmap(String filePath) throws IOException {
        //Read and write the image file
        try {
            File file = new File(filePath);
            this.imageData = ImageIO.read(file);
            System.out.println("Reading complete.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Victory!");
    }

    //Instance methods

    //Transforms image to grayscale
    //https://www.youtube.com/watch?v=cq80Itgs5Lw&amp=&feature=youtu.be
    public void transformToGrayscale() {
        for (int i = 0; i < this.imageData.getWidth(); i++) {
            for (int j = 0; j < this.imageData.getHeight(); j++) {

                //Finds the RGB color for each pixel in the image
                Color color = new Color(this.imageData.getRGB(i, j));
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                int alpha = color.getAlpha();

                //Convert colors to grayscale
                int gray = (red + green + blue) / 3;

                //Create gray color
                Color grayColor = new Color(gray, gray, gray, alpha);
                this.imageData.setRGB(i, j, grayColor.getRGB());
            }
        }
    }

    void transformToGreen() {
        for (int i = 0; i < this.imageData.getWidth(); i++) {
            for (int j = 0; j < this.imageData.getHeight(); j++) {

                //Finds the RGB color for each pixel in the image
                Color color = new Color(this.imageData.getRGB(i, j));
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                int alpha = color.getAlpha();

                //Convert colors to green
                Color greenColor = new Color(0, green, 0, alpha);
                this.imageData.setRGB(i, j, greenColor.getRGB());
            }
        }
    }

    // Get a random number
    // https://www.beginnersguidetohtml.com/guides/css/colors/rgb-hex-colors
    // http://davidnaylor.org/blog/2005/02/all-16777216-rgb-colours/
    private int randomRGBValue() {
        return (int) (Math.random() * 16_777_216);
    }

    // Transform to random color for each pixel
    void transformToRandomize() {
        for (int i = 0; i < this.imageData.getWidth(); i++) {
            for (int j = 0; j < this.imageData.getHeight(); j++) {
                this.imageData.setRGB(i, j, randomRGBValue());
            }
        }
    }

    // Writes the new image to the desired file
    void writeNewFile(String fileNameToWriteTo) throws IOException {
        File file = new File(fileNameToWriteTo);
        ImageIO.write(this.imageData, "bmp", file);
        System.out.println("Completed Writing");
    }

//    public static void pixelManipulator(String colorWanted, String colorToChange, String imagePath) {
//        File path = new File(imagePath);
//        try {
//            BufferedImage img = ImageIO.read(path);
//        } catch (IOException e) {
//            System.out.println(imagePath + "Does not exist");
//            e.printStackTrace();
//        }
//        int p = image.getRGB();
//    }

}

