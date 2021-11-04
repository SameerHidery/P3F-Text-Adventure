import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class handphone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class handphone extends Actor
{
    GreenfootImage[] textphone = new GreenfootImage[3];
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
        image.scale(image.getWidth() - 890, image.getHeight()-1600);
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
        passIndex first = new passIndex();
        passIndex second = new passIndex();
        passIndex third = new passIndex();
        passIndex fourth = new passIndex();
            
        
       
        if (Greenfoot.mouseClicked(this) && screenDisplay == 0)
        {
            setImage(textphone[1]);
            GreenfootImage image = getImage();
            image.scale(image.getWidth() - 890, image.getHeight()-1600);
            setImage(image);
            world.keyPad();
            screenDisplay = 1;
   

        }
    
        if(screenDisplay == 1)
        {
            if(numPass==0)
            {
                world.addObject(first, 905, 215);
                world.addObject(second, 935, 215);
                world.addObject(third, 965, 215);
                world.addObject(fourth, 995, 215);
            }
            else if(numPass == 1)
            {
                //switch
            }
            else if(numPass == 2)
            {
                //switch
            }
            else if(numPass == 3)
            {
                
                //switch
            }
            else if(numPass == 4)
            {

                //switch
                System.out.println("---");
                if((playerPass[0]== 4) && (playerPass[1] == 0) && (playerPass[2] == 4) && (playerPass[3] == 7 ))
                {
                    System.out.println("pass");
                    numPass= 0;
                    if(screenDisplay == 1)
                    {
                        setImage(textphone[2]);
                        GreenfootImage image = getImage();
                        image.scale(image.getWidth() - 890, image.getHeight()-1600);
                        setImage(image);
                        world.keyPad();
                        screenDisplay = 2;
                        
                      
            
                    }
                    
                }
                else
                {
                   System.out.println("fail");
                   numPass= 0;
                   
                   //switch back 
                }
            }
        }
        if(screenDisplay == 2)
        {
            //world.removeObject(one);
        }
       
    }
}
