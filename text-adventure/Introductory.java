import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.net.*;
import java.io.*;
import java.util.ArrayList;
/**
 * The first scenario (introductory chapter) of the story game will be in this world
 * 
 * @author Sameer Hidery
 * @version 1.1
 */
public class Introductory extends World
{
    Queue<String> storyQueue = new Queue<String>();
    Label storyLabel = new Label("", 30);
    
    /**
     * Constructor for objects of class Introductory.
     * 
     */
    public Introductory()
    {    
        // Create a new world with 1050x850 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
 
        try{
            Reader.readInto(storyQueue);
            } catch(Exception e) {
        }
        
        int x = 340;
        int y = 90;
        addObject(storyLabel, x, y);

    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            String sentence = storyQueue.dequeue();
            String newSentence = "";
            
            storyLabel.setValue(sentence);
            
            System.out.println(sentence);
               
        }
    }
    

}

