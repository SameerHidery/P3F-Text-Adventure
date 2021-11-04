import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttonSeven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttonSeven extends Actor
{
    public buttonSeven()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 185, image.getHeight()-205);
        setImage(image);
    }
    /**
     * Act - do whatever the buttonSeven wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            handphone.playerPass[handphone.numPass]= 7; 
            handphone.numPass++;
        }
    }    
}
