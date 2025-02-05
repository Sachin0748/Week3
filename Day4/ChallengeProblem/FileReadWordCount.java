import java.io.*;
import java.util.StringTokenizer;

public class FileReadWordCount {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\kumar\\OneDrive\\Desktop\\Capgemini\\Week3\\Day4\\Sample.txt"; 

        // Using FileReader
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            long startTime = System.nanoTime();
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += new StringTokenizer(line).countTokens();
            }
            long endTime = System.nanoTime();
            System.out.println("Word count using FileReader: " + wordCount);
            System.out.println("Time taken using FileReader: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using InputStreamReader
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
             BufferedReader br = new BufferedReader(isr)) {

            long startTime = System.nanoTime();
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += new StringTokenizer(line).countTokens();
            }
            long endTime = System.nanoTime();
            System.out.println("Word count using InputStreamReader: " + wordCount);
            System.out.println("Time taken using InputStreamReader: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
