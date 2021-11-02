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
    Queue<String> myQ = new Queue<String>();
    
    /**
     * Constructor for objects of class Introductory.
     * 
     */
    public Introductory()
    {    
        // Create a new world with 1050x850 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
 
        try{
            Reader.readInto(myQ);
            } catch(Exception e) {
        }
            
        int y = 90;
        while(!myQ.isEmpty() && Greenfoot.mouseClicked(null))
        {
                Label text1 = new Label(myQ.dequeue(), 30);
                addObject(text1, 340, y);

                y += 25;
        }
    }
}

