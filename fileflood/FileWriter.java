import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**
 * Write a description of class FileWriter here.
 * 
 * @author Alex Anderson
 * @version (a version number or a date)
 */
public class FileWriter
{
    public static void main(String[] args) throws java.io.IOException{
        Path filePath = Paths.get("C:/Spam/file.txt");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        String from;
        for(int x = 0;;x++){
            from = "Pneumonoultramicroscopicsilicovolcanoconiosis\r\n";
            Files.write(filePath, from.getBytes(), StandardOpenOption.APPEND);
        }
    }
}
