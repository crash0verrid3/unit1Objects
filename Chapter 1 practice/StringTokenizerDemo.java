import java.util.StringTokenizer;

/**
 * Write a description of class StringTokenizerDemo here.
 * 
 * @author Alex Anderson
 * @author Scott Smith
 * @version (a version number or a date)
 */
public class StringTokenizerDemo
{
    public static void main(String[] args){
        String sentence = "Mary had a little lamb.";
        StringTokenizer mystery = new StringTokenizer(sentence);
        System.out.println(mystery.countTokens());
        System.out.println(mystery.nextToken());
        System.out.println(mystery.nextToken());
    }
}

/*
 * #define STR_LEN 50
 * int main(char[] *argc, int argv){
 *     char[STR_LEN] message = "hello";
 *     // C-style
 *     printf(message);
 *     // C++ style
 *     cout << message;
 * }
 */