import java.awt.Color;

public class Turtle2
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.penDown();
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.penDown();
        for(int x=0; x<360; x++){
            turtle.forward(3);
            turtle.turn(1);
            turtle2.turn(-50);
            turtle2.forward(50);
        }
    }
}
