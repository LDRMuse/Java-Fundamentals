package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 * <p>
 * Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 * Make sure you close the connections to both files.
 */

class Example {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src/labs_examples/input_output/files/byte_data";
        FileInputStream in = null;
        FileOutputStream out = null;
        BufferedInputStream bufferedInputStream;


        try {
            in = new FileInputStream(filePath);
            out = new FileOutputStream("src/labs_examples/input_output/labs/exercise_1_output.txt");
            // read a text file 5 bytes at a time
            bufferedInputStream = new BufferedInputStream(in);
            byte[] bufferedCode = new byte[5];
            int bytesRead;

            while ((bytesRead = bufferedInputStream.read(bufferedCode)) != -1) {
                System.out.println(new String(bufferedCode, 0, bytesRead));
                //write each byte to a new file
                out.write(bufferedCode);
            }

        } catch (IOException exc) {
            System.out.println("An error occurred: " + exc.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }


    }
}