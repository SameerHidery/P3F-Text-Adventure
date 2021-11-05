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
    Label titleLabel = new Label("Late Night Office Hours", 65);
    Label startGame = new Label("Click mouse to go next", 40);
    //Adding rain sound effect
    GreenfootSound rainAndThunder = new GreenfootSound("Sound Effect - 'Rain & Thunder'.wav");
    /**
     * Constructor for objects of class TitleScren.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        
        // Adding the labels to the title screen
        addObject(titleLabel, 350, 200);
        addObject(startGame, 350, 400);
        
        
    }
    
    /** 
     * Act - This method is called whenever the 'Act' or 'Run' button gets pressed
     * 
     */
    public void act()
    {
        rainAndThunder.setVolume(40);
        //rainAndThunder.play();
        if(Greenfoot.mouseClicked(null))
        {
            Introductory gameWorld = new Introductory();
            Greenfoot.setWorld(gameWorld);
        }    
    }
}
