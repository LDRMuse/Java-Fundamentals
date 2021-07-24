package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 * -For example, change every 'a' to '-' and every 'e' to '~' .
 * -Make sure you close the connections to both files.
 * <p>
 * Then, read back the encrypted file using the BufferedReader and
 * print out the unencrypted version. Does it match the original file?
 */

class Exercise_2 {

    public static void main(String[] args) throws IOException {
        String filePathOriginal = "src/labs_examples/input_output/files/char_data.txt";
        String filePathCopy = "src/labs_examples/input_output/labs/exercise_2_output.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePathOriginal)); BufferedWriter bw = new BufferedWriter(new FileWriter(filePathCopy))) {
            String c;
            while ((c = br.readLine()) != null) {
                bw.write(c.replace("e", "~"));
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filePathCopy))) {
            String c;
            while ((c = br.readLine()) != null) {
                System.out.println(c);
            }
        }
        
    }

}