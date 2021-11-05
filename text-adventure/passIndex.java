import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class passIndex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class passIndex extends Actor
{
    private GreenfootImage image;
    public static boolean entered;
    public passIndex()
    {
        GreenfootImage image = getImage();
        image.scale(15,15);
        setImage(image);
    }
    /**
     * Act - do whatever the passIndex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //
    } 
    public void entered()
    {
        image = new GreenfootImage("fullcircle.png");
        image.scale(15,15);
        setImage(image);
    }
    public void deleted()
    {
        image = new GreenfootImage("numOFPASS.png");
        image.scale(15,15);
        setImage(image);
    }
}
