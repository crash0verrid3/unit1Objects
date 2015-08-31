public class MyObject{
    private double value = -7;
    private String value2 = "abcdefghijklmnopqrstuvwxyz";
    public MyObject(){
        double value = 8008135;
        String value2 = "abcdefghijklmnopqrstuvwxyz";
    }
    public void mutate(double x, String y, String z){
        value -= x;
        value2 = value2.replace(y, z);
    }
    public String get(){
        return value + "; " + value2;
    }
}