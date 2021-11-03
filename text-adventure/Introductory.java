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
    Label storyLabel1 = new Label("", 35);
    Label storyLabel2 = new Label("", 35);
    Label storyLabel3 = new Label("", 35);
    Label storyLabel4 = new Label("", 35);
    /**
     * Constructor for objects of class Introductory.
     * 
     */
    public Introductory()
    {    
        // Create a new world with 1050x850 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
 
        try{
            Reader.readInto(storyQueue, "https://gist.githubusercontent.com/SameerHidery/a92b98a629cf64b44875c8e1b2ed5dc9/raw/00be957644600fc11c624fc5e154ed22b62604f4/IntroductoryChapter.txt");
            } catch(Exception e) {
        }
        
        int x = 340;
        int y = 120;
        addObject(storyLabel1, x, y);
        addObject(storyLabel2, x, y + 30);
        addObject(storyLabel3, x, y + 60);
        addObject(storyLabel4, x, y + 90);
        
        
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(null) && !storyQueue.isEmpty())
        {
            String sentence = storyQueue.dequeue();
            if(sentence.length() > 41 && sentence.length() < 83){
                int line1 = sentence.lastIndexOf(" ", 41);
                int line2 = sentence.lastIndexOf(" ", 82);
                String sub1 = sentence.substring(0, line1);
                storyLabel1.setValue(sub1);
                String sub2 = sentence.substring(line1, line2);
                storyLabel2.setValue(sub2);
                String sub3 = sentence.substring(line2);
                storyLabel3.setValue(sub3);
                storyLabel4.setValue(" ");
            }
            else if(sentence.length() > 82 && sentence.length() < 124){
                int line1 = sentence.lastIndexOf(" ", 41);
                int line2 = sentence.lastIndexOf(" ", 82);
                int line3 = sentence.lastIndexOf(" ", 123);
                String sub1 = sentence.substring(0, line1);
                storyLabel1.setValue(sub1);
                String sub2 = sentence.substring(line1, line2);
                storyLabel2.setValue(sub2);
                String sub3 = sentence.substring(line2);
                storyLabel3.setValue(sub3);
                storyLabel4.setValue(" ");
            }
            else if(sentence.length() > 123){
                int line1 = sentence.lastIndexOf(" ", 41);
                int line2 = sentence.lastIndexOf(" ", 82);
                int line3 = sentence.lastIndexOf(" ", 123);
                int line4 = sentence.lastIndexOf(" ", 164);
                String sub1 = sentence.substring(0, line1);
                storyLabel1.setValue(sub1);
                String sub2 = sentence.substring(line1, line2);
                storyLabel2.setValue(sub2);
                String sub3 = sentence.substring(line2, line3);
                storyLabel3.setValue(sub3);
                String sub4 = sentence.substring(line3);
                storyLabel4.setValue(sub4);
            }
            else{
                storyLabel1.setValue(sentence);
                storyLabel2.setValue(" ");
                storyLabel3.setValue(" ");
                storyLabel4.setValue(" ");
            }

        }
    }
}


