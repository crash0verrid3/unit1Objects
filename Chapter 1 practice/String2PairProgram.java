
/**
 * Write a description of class String2PairProgram here.
 * 
 * @author Alex Anderson
 * @author Scott Smith
 * @version (a version number or a date)
 */
public class String2PairProgram
{
    // public class ConcatDemo
    public static void main(String[] args){
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";
        String message = article + " " + animal1 + " " + action + " " + article.concat(" " + animal2);
        System.out.println(message);
    }
}
