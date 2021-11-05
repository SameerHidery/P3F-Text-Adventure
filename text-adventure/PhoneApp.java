import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PhoneApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhoneApp extends Actor
{
    public PhoneApp()
    {
        GreenfootImage image = getImage();
        image.scale(95,75);
        setImage(image);
    }
    /**
     * Act - do whatever the PhoneApp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld world= (MyWorld) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            handphone.screenDisplay = 3;
            world.removeObject(this);
            world.openContacts();
            
        }
    }    
}
