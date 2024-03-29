/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        //Run the application to make sure read and write of bitmap file is possible

        //Move code from main method into Bitmap class, create Bitmap object in main method, write it out to a different file name (hardcoded String)

        //Run the application to make sure that it can still be read and then write file that code abstracts

        //Call the transform method in main method and ensure that bitmap can be read and be written out as a bitmap file that is the same size but with red replaced with green

        //Start working with command line arguments. Start by making the output file path a command line argument and ensure it works.

        String file = args[0];

        // Create instance using that file's data
        Bitmap bitmapFromFile = new Bitmap(file);

        // Methods
        if (args[2].equals("grayscale")) {
            bitmapFromFile.transformToGrayscale();
        }

        if (args[2].equals("green")) {
            bitmapFromFile.transformToGreen();
        }

        if (args[2].equals("randomize")) {
            bitmapFromFile.transformToRandomize();
        }
        bitmapFromFile.writeNewFile(args[1]);
    }

}

