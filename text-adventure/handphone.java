import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class handphone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class handphone extends Actor
{
    GreenfootImage[] textphone = new GreenfootImage[4];
    public static int screenDisplay = 0;
    
    static int[] playerPass = new int[4]; 
    public static int numPass = 0;
    
    
    boolean firstScrONE;
    /**
     * Constructor
     * Sets the size of the cellphone
     */
    public handphone()
    {
        for(int i=0 ; i< textphone.length; i++)
        {
            textphone[i] = new GreenfootImage("images/textphone/cellphone" + i + ".png");
        }
        setImage(textphone[0]);
        GreenfootImage image = getImage();
        image.scale(356, 635);
        setImage(image);
        screenDisplay = 0;
        firstScrONE = true;
        
        
    }
    
    /**
     * Act - do whatever the handphone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld world= (MyWorld) getWorld();

        if (Greenfoot.mouseClicked(this) && screenDisplay == 0)
        {
            setImage(textphone[1]);
            GreenfootImage image = getImage();
            image.scale(356, 635);
            setImage(image);
            world.keyPad();
            screenDisplay = 1;
   

        }
    
        if(screenDisplay == 1)
        {
            if(numPass == 1)
            {
                world.circle[0].entered();
            }
            else if(numPass == 2)
            {
                world.circle[1].entered();
            }
            else if(numPass == 3)
            {
                world.circle[2].entered();
            }
            else if(numPass == 4)
            {
                world.circle[3].entered();
                if((playerPass[0]== 4) && (playerPass[1] == 0) && (playerPass[2] == 4) && (playerPass[3] == 7 ))
                {
                    numPass= 0;
                    if(screenDisplay == 1)
                    {
                        setImage(textphone[2]);
                        GreenfootImage image = getImage();
                        image.scale(356, 635);
                        setImage(image);
                        world.keyPad();
                        screenDisplay = 2;
                        
                        
                      
            
                    }
                }
                else
                {
                   numPass= 0;
                   world.circle[3].deleted();
                   world.circle[2].deleted();
                   world.circle[1].deleted();
                   world.circle[0].deleted();
                   
                }
            }
        }
        if(screenDisplay == 3)
        {
            setImage(textphone[3]);
            GreenfootImage image = getImage();
            image.scale(356, 635);
            setImage(image);
            
            
        }
        if(screenDisplay == 4)
        {
            world.removeObject(this);
            world.closeContacts();
        }
       
    }
}
