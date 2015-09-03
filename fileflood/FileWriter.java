import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
/**
 * Write a description of class FileWriter here.
 * 
 * @author Alex Anderson
 * @version (a version number or a date)
 */
public class FileWriter
{
    public static void main(String[] args){
        try(PrintWriter out = new PrintWriter(new BufferedWriter())) {
            while(true){
                out.println("Pneumonoultramicroscopicsilicovolcanoconiosis");
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
