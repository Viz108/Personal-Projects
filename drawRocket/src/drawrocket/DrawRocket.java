
package drawrocket;

/**
 * @author Vishal
 * Chapter 4 Programming Exercise 1
 */

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class DrawRocket extends JApplet 
{

    public void paint( Graphics g) 
    {
        super.paint(g);
        Color hullColor = new Color(50, 50, 50);
        g.fillRect(200, 200, 50, 50);
        
    }
    
}
