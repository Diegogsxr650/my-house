/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square field;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(150);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.moveHorizontal(100);
        moon.moveVertical(-60);
        moon.changeSize(35);
        
        
        field = new Square();
        field.makeVisible();
        field.changeColor("green");
        field.moveVertical(125);
        field.changeSize(2000);
        field.moveHorizontal(-400);

        simulateSunset();
    }
    
    public void simulateSunset()
    
    {
        for (int i = 0; i <250; i++){
            sun.moveVertical(1);
        }
    
        moon.makeVisible();
        moon.changeColor("magenta");
        moon.moveHorizontal(80);
        moon.moveVertical(-20);
        moon.changeSize(60);    
    
    }

    private void wait(int miliseconds)
    {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
        }
    }
    public void amanecer()
    
    {
        for (int i = 0; i <250; i++){
            sun.moveVertical(-1);
            moon.makeInvisible();
            moon.changeColor("magenta");
            moon.moveHorizontal(80);
            moon.moveVertical(-20);
            moon.changeSize(60); 
        }
    
       
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            field.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            field.changeColor("green");
        }
    }
}
