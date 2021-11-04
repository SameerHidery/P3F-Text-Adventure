import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonKey extends Actor
{
    private GreenfootImage image;
    public int value;
    
    public ButtonKey(int value)
    {
        image = new GreenfootImage("button" + value + ".png");
        image.scale(image.getWidth() - 185, image.getHeight()-205);
        this.value = value;
        setImage(image);
    }
    
    /**
     * Act - do whatever the buttonZero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            handphone.playerPass[handphone.numPass]= value; 
            handphone.numPass++;
            
        }
    }    
}
