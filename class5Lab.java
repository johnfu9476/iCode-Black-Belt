import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.Queue;
public class class5Lab {
    public static void main(String[] args) throws Exception {
        
        // Specify the path to your text file
        String filePath = "reversePoem.txt";

        // Create a stack to store the words
        Stack<String> lineStack = new Stack<>();
        Queue lineQueue = new Queue(1000);
        int maxLineLength = 0;

        try {
            // Open the file for reading using the BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read the single line from the file
            String line1 = reader.readLine();

            // Replace every occurence of "Zz" with the empty string, to get rid of it.
            String line2 = line1.replace("Zz", "");

            // Replace every occurence of "yY" with a space, to establish words.
            String line3 = line2.replace("yY", " ");

            // Split the line by the characters "XX" to get each line of the poem in an array
            String[] lines = line3.split("XX");

            
            for (String line : lines) {
                lineStack.push(line);
                lineQueue.enqueue(line);
                if (line.length() > maxLineLength) {
                    maxLineLength = line.length();
                }
            }

            // close the BufferedReader
            reader.close();

        } catch (IOException e) {
            // Handle exceptions (e.g., file not found, IO error)
            e.printStackTrace();
        }

        // Specify the path to the output text file. This assumes one has already been made.
        String outputPath = "reversePoemSolved.txt";

        try {
            // Create a BufferedWriter to write to the text file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

            while(!lineStack.isEmpty()) {
                String poppedline= lineStack.pop();
                writer.write(poppedline);
                int padding = maxLineLength - poppedline.length();
                for (int i = 0; i < padding; i++) {
                    writer.write(" ");
                }
                writer.write("\t");
                String dequeuedline = lineQueue.dequeue();
                writer.write(dequeuedline);
                writer.newLine();
            }

            // Close the BufferedWriter
            writer.close();

        } catch (IOException e) {
            // Handle exceptions (e.g., file not found, IO error)
            e.printStackTrace();
        }




        
        System.out.println("Hello, World!");
    }
}
