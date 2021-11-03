import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The first scenario (introductory chapter) of the story game will be in this world
 * 
 * @author Sameer Hidery
 * @version 1.1
 */
public class CopyOfIntroductory extends World
{
    Queue<String> storyQueue = new Queue<String>();
    Queue<String> storyQueue2 = new Queue<String>();
    
    HashMap<String, String> decisions = new HashMap<String, String>();
    
    Label storyLabel1 = new Label("", 35);
    Label storyLabel2 = new Label("", 35);
    Label storyLabel3 = new Label("", 35);
    Label storyLabel4 = new Label("", 35);
    
    Button yesButton = new Button();
    Button noButton = new Button();
    
    Label choice1 = new Label("Yes", 40);
    Label choice2 = new Label("No", 40);
    
    int x = 340;
    int y = 120;
    /**
     * Constructor for objects of class CopyOfIntroductory.
     * 
     */
    public CopyOfIntroductory()
    {    
        // Create a new world with 1050x850 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
 
        try{
            Reader.readInto(storyQueue, "https://gist.githubusercontent.com/SameerHidery/a92b98a629cf64b44875c8e1b2ed5dc9/raw/00be957644600fc11c624fc5e154ed22b62604f4/IntroductoryChapter.txt");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(storyQueue2, "https://gist.githubusercontent.com/SameerHidery/f1a705ee1f1879e7b8814465a7153305/raw/1a15682b0bfe41349d669811ff81721a4102ba35/YesHeadphones");
            } catch(Exception e) {
        }
        

        addObject(storyLabel1, x, y);
        addObject(storyLabel2, x, y + 30);
        addObject(storyLabel3, x, y + 60);
        addObject(storyLabel4, x, y + 90);
        
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(null) && !storyQueue.isEmpty())
        {
            print(storyQueue);
            if(storyQueue.isEmpty()){
            addObject(yesButton, 200, 360);
            addObject(noButton, 480, 360);
            }
        }
        if(Greenfoot.mouseClicked(yesButton)){
            removeObject(yesButton);
            removeObject(noButton);
            decisions.put("one", "true");
        }
        if(!storyQueue2.isEmpty() && decisions.get("one").equals("true")){
            if(Greenfoot.mouseClicked(null)){
                print(storyQueue2);
            }
        }
    }
    public void print(Queue<String> q)
    {
        String sentence = q.dequeue();
        nextText(sentence);
    }
    public void nextText(String str)
    {
        if(str.length() > 41 && str.length() < 83){
            int line1 = str.lastIndexOf(" ", 41);
            int line2 = str.lastIndexOf(" ", 82);
            String sub1 = str.substring(0, line1);
            storyLabel1.setValue(sub1);
            String sub2 = str.substring(line1, line2);
            storyLabel2.setValue(sub2);
            String sub3 = str.substring(line2);
            storyLabel3.setValue(sub3);
            storyLabel4.setValue(" ");
        }
        else if(str.length() > 82 && str.length() < 124){
            int line1 = str.lastIndexOf(" ", 41);
            int line2 = str.lastIndexOf(" ", 82);
            int line3 = str.lastIndexOf(" ", 123);
            String sub1 = str.substring(0, line1);
            storyLabel1.setValue(sub1);
            String sub2 = str.substring(line1, line2);
            storyLabel2.setValue(sub2);
            String sub3 = str.substring(line2);
            storyLabel3.setValue(sub3);
            storyLabel4.setValue(" ");
        }
        else if(str.length() > 123){
            int line1 = str.lastIndexOf(" ", 41);
            int line2 = str.lastIndexOf(" ", 82);
            int line3 = str.lastIndexOf(" ", 123);
            int line4 = str.lastIndexOf(" ", 164);
            String sub1 = str.substring(0, line1);
            storyLabel1.setValue(sub1);
            String sub2 = str.substring(line1, line2);
            storyLabel2.setValue(sub2);
            String sub3 = str.substring(line2, line3);
            storyLabel3.setValue(sub3);
            String sub4 = str.substring(line3);
            storyLabel4.setValue(sub4);
        }
        else{
            storyLabel1.setValue(str);
            storyLabel2.setValue(" ");
            storyLabel3.setValue(" ");
            storyLabel4.setValue(" ");
        }
    }
}


