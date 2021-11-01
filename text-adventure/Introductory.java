import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The first scenario (introductory chapter) of the story game will be in this world
 * 
 * @author Sameer Hidery
 * @version 1.1
 */
public class Introductory extends World
{

    /**
     * Constructor for objects of class Introductory.
     * 
     */
    public Introductory()
    {    
        // Create a new world with 1050x850 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        
        
        Computer playerScreen = new Computer();
        Desk playerDesk = new Desk();
        Lamp playerLamp = new Lamp();
        PictureFrame playerPicture = new PictureFrame();
        CreepyFigure enemy = new CreepyFigure();
        
    }
}

