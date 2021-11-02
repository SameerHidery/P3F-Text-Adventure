import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen
 * 
 * @author Sameer Hidery 
 * @version 1.1
 */
public class TitleScreen extends World
{
    //Create labels
    Label titleLabel = new Label("Late Night Office Hours", 80);
    Label startGame = new Label("Press space to start", 40);
    /**
     * Constructor for objects of class TitleScren.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 1050x850 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);  
        
        // Adding the labels to the title screen
        addObject(titleLabel, 640, 200);
        addObject(startGame, 640, 550);
    }
    
    /** 
     * Act - This method is called whenever the 'Act' or 'Run' button gets pressed
     * 
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Introductory gameWorld = new Introductory();
            Greenfoot.setWorld(gameWorld);
        }    

    }
}
