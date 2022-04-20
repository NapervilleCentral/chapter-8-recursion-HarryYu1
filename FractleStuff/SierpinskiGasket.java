import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import java.awt.geom.*;

public class SierpinskiGasket extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;

    private final double SQ = Math.sqrt(3.0) / 6;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;


/*
   //x is accross and y is down
   point 1 - Right  A
   point 2 - Left   B
   point 3 - Top    C
   point 4 draws back to point 1 to complete triangle

    private int[] xPos = {360, 40, 200, 360};
    private int[] yPos = {300, 300, 20, 300};
*/
    private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};
    int bicect;


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public SierpinskiGasket()
    {
        
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawCircle method.
    //-----------------------------------------------------------------
    @Override
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
       
        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);
       
    }

  

   /** Draws a triangle  in the middle of the 3 x,y points provided
        finds the midpoints of triangles line segments
        uses midpoint to draw a triangle inside of the points provided

   @param array of 4 points a -> b -> c -> a

   */

   public void Triangle(int[] xPosit, int[] yPosit, Graphics page)
   {
       int dxsquared = (int)Math.pow(xPosit[0] - xPosit[1],2);
       int dysquared = (int)Math.pow(yPosit[0] - yPosit[1],2);
       int distance = (int)Math.sqrt(dxsquared + dysquared);



        if (distance > 10)
        {
            //find midpoints and draw triangle
            //int ABMidx = (xPos[0]
            //int ABMidy = (
            int ABMidx = (xPosit[0] + xPosit[1]) /2;
            int BCMidx = (xPosit[1] + xPosit[2]) /2;
            int CAMidx = (xPosit[2] + xPosit[3]) /2;
            
            int ABMidy = (yPosit[0] + yPosit[1]) /2;
            int BCMidy = (yPosit[1] + yPosit[2]) /2;
            int CAMidy = (yPosit[2] + yPosit[3]) /2;
            
            
            int[] xs = {ABMidx, BCMidx, CAMidx, ABMidx};
            int[] ys = {ABMidy, BCMidy, CAMidy, ABMidy};
            
            page.drawPolyline (xs, ys, xs.length);
            //draw the tri
            Triangle(xs, ys, page);
            
            //call the 3 new triangles
            


        }



   }//end of Triangle

}
