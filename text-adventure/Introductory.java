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
public class Introductory extends World
{
    Queue<String> introductory = new Queue<String>();
    Queue<String> withHeadphones = new Queue<String>();
    Queue<String> noHeadphones = new Queue<String>();
    Queue<String> offLockdown= new Queue<String>();
    Queue<String> onLockdown = new Queue<String>();
    Queue<String> callGrandma = new Queue<String>();
    Queue<String> callMom = new Queue<String>();
    Queue<String> callManager = new Queue<String>();
    Queue<String> runToElevator = new Queue<String>();
    Queue<String> storyQueue10 = new Queue<String>();
    Queue<String> storyQueue11 = new Queue<String>();
    
    HashMap<String, Boolean> decisions = new HashMap<String, Boolean>();
    
    //Create labels to chop up sentences. Shouldn't take more than 4 lines
    Label storyLabel1 = new Label("", 33);
    Label storyLabel2 = new Label("", 33);
    Label storyLabel3 = new Label("", 33);
    Label storyLabel4 = new Label("", 33);
    
    Button trueButton = new Button();
    Button falseButton = new Button();
    
    Label choice1 = new Label(" ", 40);
    Label choice2 = new Label(" ", 40);
    
    int part = 0;
    
    boolean first;
    boolean second;
    boolean third;
    boolean fourth;
    boolean fifth;
    boolean sixth;
    
    int x = 340;
    int y = 120;
    /**
     * Constructor for objects of class CopyOfIntroductory.
     * 
     */
    public Introductory()
    {    
        // Create a new world with 1050x850 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
 
        try{
            Reader.readInto(introductory, "https://gist.githubusercontent.com/SameerHidery/a92b98a629cf64b44875c8e1b2ed5dc9/raw/00be957644600fc11c624fc5e154ed22b62604f4/IntroductoryChapter.txt");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(withHeadphones, "https://gist.githubusercontent.com/SameerHidery/f1a705ee1f1879e7b8814465a7153305/raw/1a15682b0bfe41349d669811ff81721a4102ba35/YesHeadphones");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(noHeadphones, "https://gist.githubusercontent.com/SameerHidery/a737bb3120e031e61523528556701193/raw/830d183da1ef30988c9b5aa78590d914ade7484c/noHeadphones");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(offLockdown, "https://gist.githubusercontent.com/SameerHidery/23c46a1f67268cece75ee34e9c19bdab/raw/1d53b7683367c80eddd5d5940f20772b5460c483/TurnOffLockdownSystem");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(onLockdown, "https://gist.githubusercontent.com/SameerHidery/de6697d484c96008365eb387a53a3dba/raw/bd9a8fd1cc8230514a76114023543d203d0b5543/KeepLockdownOn");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(callGrandma, "https://gist.githubusercontent.com/SameerHidery/201137d60ce73adcccd664dc80a358c4/raw/77a5e8b0f4b05f71c5b2a010718222fdbb151e40/GrandmaCall");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(callMom, "https://gist.githubusercontent.com/SameerHidery/27fbaf4d077166f6712c91830904e125/raw/22dc0d3cf9d9b0dc596e0d80d3a3f13973cc1c06/callMom");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(callManager, "https://gist.githubusercontent.com/SameerHidery/a88a3424d274cd5c4081d953bed64db7/raw/2adfb135eb59f23352e15236993400b0bd7ec376/callManager");
            } catch(Exception e) {
        }
        
        addObject(storyLabel1, x, y);
        addObject(storyLabel2, x, y + 30);
        addObject(storyLabel3, x, y + 60);
        addObject(storyLabel4, x, y + 90);
        
    }
    public void act()
    {
        /**
         * First part of story with first decision for the user
         */
        if(Greenfoot.mouseClicked(null) && !introductory.isEmpty())
        {
            print(introductory);
            if(introductory.isEmpty()){
                addButtons();
                choice1.setValue("Yes");
                choice2.setValue("No");
            }
        }
        
        //if the left choice is clicked
        if(Greenfoot.mouseClicked(trueButton) || Greenfoot.mouseClicked(choice1)){
            removeButtons();
            if(part == 0){
                decisions.put("one", true);
                first = decisions.get("one");
                part++;
            }
            else if(part == 1){
                decisions.put("two", true);
                second = decisions.get("two");
                part++;
            }
            else if(part == 2)
            {
                decisions.put("three", true);
                third = decisions.get("three");
                part++;
            }
            else if(part == 3)
            {
                decisions.put("four", true);
                fourth = decisions.get("four");
                part++;
            }
            else if(part == 4)
            {
                decisions.put("five", true);
                fifth = decisions.get("five");
                part++;
            }
            else if(part == 5)
            {
                decisions.put("six", true);
                sixth = decisions.get("six");
                part++;
            }
        }
        
        //Determines false if the right button was clicked for all the decisions and stores each in the hashmap 
        if(Greenfoot.mouseClicked(falseButton) || Greenfoot.mouseClicked(choice2)){
            removeButtons();
            if(part == 0){
                decisions.put("one", false);
                first = decisions.get("one");
                part++;
            }
            else if(part == 1){
                decisions.put("two", false);
                second = decisions.get("two");
                part++;
            }
            else if(part == 2){
                decisions.put("three", false);
                third = decisions.get("three");
                part++;
            }
            else if(part == 3)
            {
                decisions.put("four", false);
                fourth = decisions.get("four");
                part++;
            }
            else if(part == 4)
            {
                decisions.put("five", false);
                fifth = decisions.get("five");
                part++;
            }
            else if(part == 5)
            {
                decisions.put("six", false);
                sixth = decisions.get("six");
                part++;
            }
        }
        /**
         * The story continues from when the user chooses to put on headphones or not
         */
        if(part == 1){
            if(!withHeadphones.isEmpty() && first == true && Greenfoot.mouseClicked(null)){
                print(withHeadphones);
                if(withHeadphones.isEmpty()){
                    addButtons();
                    choice1.setValue("Turn it off");
                    choice2.setValue("Keep it on");
                }
            }
            if(!noHeadphones.isEmpty() && first == false && Greenfoot.mouseClicked(null)){
                print(noHeadphones);
                if(noHeadphones.isEmpty()){
                    addButtons();
                    choice1.setValue("Turn it off");
                    choice2.setValue("Keep it on");        
                }
            }
        }
        
        if(part == 2){
            if(!offLockdown.isEmpty() && second == true && Greenfoot.mouseClicked(null)){
                print(offLockdown);
                if(offLockdown.isEmpty()){
                    addButtons();
                    choice1.setValue("Mother");
                    choice2.setValue("Grandma");
                }
            }
            if(!onLockdown.isEmpty() && second == false && Greenfoot.mouseClicked(null)){
                print(onLockdown);
                if(onLockdown.isEmpty()){
                    addButtons();
                    choice1.setValue("Yell at him");
                    choice2.setValue("Complain");
                }
            }
        }
        if(part == 3 && second == true){
            if(!callMom.isEmpty() && third == true && Greenfoot.mouseClicked(null))
            {
                print(callMom);
            }
            if(!callGrandma.isEmpty() && third == false && Greenfoot.mouseClicked(null))
            {
                print(callGrandma);
            }
            if(callGrandma.isEmpty() || callMom.isEmpty()){
                gameLost();
            }
        }
        

    }
    public void gameLost()
    {
        EndScreen end = new EndScreen();
        Greenfoot.setWorld(end);
    }
    public void addButtons()
    {
        addObject(trueButton, 200, 360);
        addObject(falseButton, 480, 360);
        addObject(choice1, trueButton.getX(), trueButton.getY());
        addObject(choice2, falseButton.getX(), falseButton.getY());
    }
    public void removeButtons()
    {
        removeObject(trueButton);
        removeObject(falseButton);
        removeObject(choice1);
        removeObject(choice2);
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
            //int line2 = str.lastIndexOf(" ", 82);
            String sub1 = str.substring(0, line1);
            storyLabel1.setValue(sub1);
            String sub2 = str.substring(line1);
            storyLabel2.setValue(sub2);
            storyLabel3.setValue(" ");
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


