package labs_examples.input_output.labs.Exercise_3;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 * <p>
 * 4) Demonstrate the use of the DataInputStream and DataOutputStream
 */

public class Exercise_03_DataInputStream_DataOutputStream {
    public static void main(String[] args) throws IOException {

        int a = 1;
        char b = '2';
        boolean c = true;

        String filePath = "src/labs_examples/input_output/files/exercise_03_output.txt";
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath))) {
            System.out.println("Writing " + a );
            dataOutputStream.writeInt(a);

            System.out.println("Writing " + b );
            dataOutputStream.writeChar(b);

            System.out.println("Writing " + c );
            dataOutputStream.writeBoolean(c);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath))) {
            a = dataInputStream.readInt();
            System.out.println("Reading " + a );

            b = dataInputStream.readChar();
            System.out.println("Reading " + b );

            c = dataInputStream.readBoolean();
            System.out.println("Reading " + c );
        }

    }
}
