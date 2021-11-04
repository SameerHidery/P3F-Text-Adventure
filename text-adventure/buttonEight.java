import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttonEight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttonEight extends Actor
{
    public buttonEight()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 185, image.getHeight()-205);
        setImage(image);
    }
    /**
     * Act - do whatever the buttonEight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            handphone.playerPass[handphone.numPass]= 8; 
            handphone.numPass++;
            
        }
    }    
}
