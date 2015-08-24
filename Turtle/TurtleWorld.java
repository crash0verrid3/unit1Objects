import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.penDown();
        for(int x=0; x<200; x++){
            turtle.forward(x);
            turtle.turn(x);
        }
        turtle.penUp();
        turtle.turn(180);
        turtle.forward(200);
        turtle.penDown();
    }
}
