package labs_examples.input_output.labs.Exercise_3;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate using a buffer on one of the Byte Streams
 *
 */


public class Exercise_03_ByteStreams {

        public static void main(String[] args) throws FileNotFoundException {

            // Byte Stream 1 - Write bytes to new file
            String filePath = "src/labs_examples/input_output/files/exercise_03_byte_data";
            byte data[] = new byte[8];
            int i;

            try (FileOutputStream out = new FileOutputStream(filePath)) {
                System.out.println("Enter 8 bits of code");
                System.in.read(data);

                for (byte bit : data) {
                    out.write(bit);
                }

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }


            // Byte Stream 2 w/ Buffer - Reading bytes from the file we just created
            try (BufferedInputStream br = new BufferedInputStream(new FileInputStream(filePath))) {

                while ((i = br.read(data)) != -1) {
                    System.out.println(new String(data, 0, i));
                }

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }


        }
}
