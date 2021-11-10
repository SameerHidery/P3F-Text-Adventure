import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world starts off the game by telling the player to use headphones
 * 
 * @author Sameer Hidery, Murtaza Asrani, Keira Sutharsanaraj
 */
public class Headphones extends World
{
    //Creates the headphones label
    Label headphones = new Label("Use Headphones for Best Experience", 50);
    /**
     * Constructor for objects of class Headphones.
     * 
     */
    public Headphones()
    {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        
        //Adds the headphones and instructions labels
        addObject(headphones, 640, 150);
        addObject(StoryGame.instructions, 640, 570);
        
        //Sets the text of the headphones label to white
        headphones.setLineColor(Color.WHITE);
        headphones.setFillColor(Color.WHITE);
        
        //Sets the text of the instructions label to white
        StoryGame.instructions.setLineColor(Color.WHITE);
        StoryGame.instructions.setFillColor(Color.WHITE);
    }
    
    public void act(){
        //Sets the speed of greenfoot's execution to 100
        Greenfoot.setSpeed(100);
        
        //Changes world to story game when mouse is clicked
        if(Greenfoot.mouseClicked(null)){
            StoryGame game = new StoryGame();
            Greenfoot.setWorld(game);
        }
    }
    
    
}
