import java.util.Random;
/**
 * Write a description of class CowSay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CowSay
{
    public static void CowSay()
    {
        String[] greetings = {"     ___________\n    /           \\\n    |Hello, Alex!|\n    \\___________ \\\n                \\_| /\\_/\\\n                    \\* */___________\n                     \\_/  o         \\\n                       |       O     |\n                        \\  O_____   /\n                         |_|     |_|"};
        int index = (new Random()).nextInt(greetings.length);
        System.out.println(greetings[index]);
    }
}
