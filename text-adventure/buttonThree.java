import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttonThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttonThree extends Actor
{
    public buttonThree()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 185, image.getHeight()-205);
        setImage(image);
    }    
    /**
     * Act - do whatever the buttonThree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            handphone.playerPass[handphone.numPass]= 3; 
            handphone.numPass++;
        }
    }    
}
