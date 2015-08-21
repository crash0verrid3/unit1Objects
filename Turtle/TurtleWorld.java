import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.penDown();
        for(int z=0; z<50; z++){
            for(int x=0; x<14; x++){
                for(int y=0; y<7; y++){
                    turtle.setPenColor(Color.GREEN);
                    turtle.forward(14*x+14+y);
                    turtle.turnRight();
                    turtle.setPenColor(Color.BLUE);
                    turtle.forward(14*x+14+y);
                    turtle.turnRight();
                    turtle.setPenColor(Color.RED);
                    turtle.forward(14*x+14+y);
                    turtle.turnRight();
                    turtle.setPenColor(Color.YELLOW);
                    turtle.forward(14*x+14+y);
                    turtle.turnRight();
                    turtle.setPenColor(Color.BLACK);
                    turtle.forward(14*x+14+y);
                    turtle.turnRight();
                }
            }
        }
        turtle.penUp();
        turtle.turnRight();
        turtle.turnRight();
        turtle.forward(200);
        turtle.penDown();
    }
}
