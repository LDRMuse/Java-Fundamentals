package labs_examples.input_output.labs.Exercise_3;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 * <p>
 * 1) Demonstrate the usage of at least two additional Character Streams
 * 2) Demonstrate using a buffer on one of the Character Streams
 */


public class Exercise_03_CharacterStreams {
    public static void main(String[] args) throws IOException {

        String filePath = "src/labs_examples/input_output/files/exercise_03_character_data";
        byte data[] = new byte[32];
        String i;


        // Character Stream
        try (FileWriter fr = new FileWriter(filePath)) {
            System.out.println("Write a sentence.");
            System.in.read(data);

            for (byte bit : data) {
                fr.write(bit);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // Character Stream with Buffer
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((i = br.readLine()) != null) {
                System.out.println(i);
            }
        }


    }
}
