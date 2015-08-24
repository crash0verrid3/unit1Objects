import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Write a description of class Input here.
 * 
 * @author Alex Anderson 
 * @version 8/21/2015
 */
public class Input
{
    public static String prompt(String prompt) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(prompt);
        String s = br.readLine();
        return s;
    }
}
