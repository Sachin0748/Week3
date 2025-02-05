import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertByteToCharacterStream {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("example.txt");
            InputStreamReader reader= new InputStreamReader(input);
            BufferedReader bf = new BufferedReader(reader);
            int i;
            while((i= reader.read())!=-1){
                System.out.print((char)i);;
            }
            input.close();
            bf.close();
        }
        catch (IOException e){
            System.out.println("An error ocuured");
            e.printStackTrace();
        }
    }
}
