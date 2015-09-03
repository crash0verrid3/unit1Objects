import java.awt.Color;

public class Turtle2
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.penDown();
        for(int x=0; x<360; x++){
            turtle.forward(2);
            turtle.turn(1);
        }
    }
}
