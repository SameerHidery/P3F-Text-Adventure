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
    ArrayList<String> myList = new ArrayList<String>();
    
    
    /**
     * Constructor for objects of class Introductory.
     * 
     */
    public Introductory()
    {    
        // Create a new world with 1050x850 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        
        for(int i = 0; i < myList.size(); i++)
        {
            Label titleLabel = new Label(myList.get(i), 80);
        }
        
        try{
            Reader.readInto(myList);
            } catch(Exception e) {
            }
            
        System.out.println(myList.get(3));

    }
}

