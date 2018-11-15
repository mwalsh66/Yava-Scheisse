import objectdraw.*;
import java.awt.*;

// A program that displays the words "Pressed" and "Released"
// where the mouse button is pressed and released while connecting
// each such pair of points with a line.
public class ConnectTwo extends WindowController{

    private Location firstPoint;        // The location where button was pressed
   //DrawingCanvas canvas;
        
    // Display "Pressed" when the button is pressed.
    public void onMousePress(Location pressPoint){
        new Text("Pressed", pressPoint, canvas);
        firstPoint = pressPoint;
        
    }
    
    public void onMouseDrag(Location p)
    {
       if( firstPoint != null)
       {
          firstPoint.getX(); 
       }
    }

    // Display "Released" and draw a line from where the mouse
    // was last pressed.
    public void onMouseRelease(Location releasePoint){
        new Text("Released", releasePoint, canvas);
        new Line(firstPoint, releasePoint, canvas);
    }

}