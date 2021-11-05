import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContactList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContactList extends Actor
{
    private GreenfootImage image;
    public int value;
    public ContactList(int value)
    {
        image = new GreenfootImage("images/contacts/tact" + value + ".png");
        image.scale(325, 100);
        this.value = value;
        setImage(image);
    }
    /**
     * Act - do whatever the ContactList wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(value==0)
            {
                System.out.println("true");
                handphone.screenDisplay=4; 
            }
            else if(value==1)
            {
                System.out.println("false");
                handphone.screenDisplay=4;
            }
            else if(value==2)
            {
                System.out.println("second true");
                handphone.screenDisplay=4;
            }
            
        }
    }    
}
