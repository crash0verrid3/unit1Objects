import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.penDown();
        int x;
        int y;
        for(x=0; x<20000; x++){
            for(y=0; y<200; y++){
                turtle.forward(10);
                turtle.turn(70);
            }
            turtle.forward(30);
            turtle.turn(60);
        }
        turtle.penUp();
        turtle.turn(180);
        turtle.forward(200);
        turtle.penDown();
    }
}
