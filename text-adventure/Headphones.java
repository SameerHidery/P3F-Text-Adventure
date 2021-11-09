import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Headphones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Headphones extends World
{
    Label headphones = new Label("Use Headphones for Best Experience", 50);
    /**
     * Constructor for objects of class Headphones.
     * 
     */
    public Headphones()
    {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        
        addObject(headphones, 640, 150);
        addObject(StoryGame.instructions, 640, 570);
        
        headphones.setLineColor(Color.WHITE);
        headphones.setFillColor(Color.WHITE);
        
        StoryGame.instructions.setLineColor(Color.WHITE);
        StoryGame.instructions.setFillColor(Color.WHITE);
    }
    
    public void act(){
        Greenfoot.setSpeed(100);
        if(Greenfoot.mouseClicked(null)){
            StoryGame game = new StoryGame();
            Greenfoot.setWorld(game);
        }
    }
    
    
}
