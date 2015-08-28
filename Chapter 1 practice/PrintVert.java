import javax.swing.JOptionPane;

public class PrintVert
{
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("What is your name: ");
        String output = "Hello, " + name;
        for(int x=0; x<output.length(); x++){
            for(int y=0; y<x; y++){
                System.out.print(" ");
            }
            System.out.println(output.charAt(x));
        }
        System.out.print("\n");
    }
}
