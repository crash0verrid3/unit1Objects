
/**
 * Write a description of class String2PairProgram2 here.
 * 
 * @author Alex Anderson
 * @author Scott Smith
 * @version (a version number or a date)
 */
public class String2PairProgram2
{
    // public class TrimIt
    public static void main(String[] args){
        String sentence1 = "      abc";
        String sentence2 = "   def";
        String sentence3 = "ghi      ";
        
        String message = sentence1.trim() + sentence2.trim() + sentence3.trim();
        
        System.out.println(message);
    }
}
