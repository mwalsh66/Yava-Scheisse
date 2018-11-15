// Always include this line
import objectdraw.*;

/**
 * Example: Rising Sun
 *          From "Java: An Eventful Approach", Section 2.1
 *          
 * Demonstrates using an instance variable to store a reference to an object.
 */

import objectdraw.*;
import java.awt.*;
/**
 * a program that produces an animation of the sun rising.
 * The animation is driven by clicking the mouse button.
 * the faster the mouse is clickes, the faster the sun will rise.
 */
public class RisingSun extends WindowController
{
    
    private FilledOval sun;
    private Text instructions;
    private Location initialLocation = new Location(150,250);
    //The begin method is called when the program starts
    public void begin()
    { 
        //Create a circle at location (150, 350) with radius 100
        sun = new FilledOval( initialLocation, 100, 100, canvas );
        
        Color myColor = new Color(0, 200, 255);
        
        sun.setColor(myColor);
        instructions = new Text( " Please click the mouse repeatedly", 20, 20, canvas);
      
     
     
    }

    public void onMouseClick(Location point)
    {
        sun.move(0, -10);
        instructions.hide();
    }
    
    public void onMouseExit(Location Point)
    {
        sun.moveTo(initialLocation);
        instructions.show();

    }
}
