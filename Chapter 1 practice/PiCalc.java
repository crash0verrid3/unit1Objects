/**
 * Write a description of class PiCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PiCalc
{
    private static final int CUT_OFF = 299792;
    public static void piCalc(){
        boolean add = false;
        double pi = 4.0;
        long denom = 3;
        double temp = 0;
        for(int x=0; x<CUT_OFF; x++){
            temp = 4.0 * (1.0 / denom);
            if(add){
                pi += temp;
            } else {
                pi -= temp;
            }
            denom += 2;
            add = !add;
        }
        System.out.println(pi);
    }
}
