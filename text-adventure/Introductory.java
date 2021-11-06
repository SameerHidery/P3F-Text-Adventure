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
    Queue<String> runToStairwell = new Queue<String>();
    Queue<String> runToElevator = new Queue<String>();
    Queue<String> viewFax = new Queue<String>();
    
    HashMap<String, Boolean> decisions = new HashMap<String, Boolean>();
    
    //Create sounds
    GreenfootSound keyboard = new GreenfootSound("Keyboard, typing sound effect.wav"); 
    GreenfootSound powerDown = new GreenfootSound("Power Down Sound effect.wav"); 
    GreenfootSound elevator = new GreenfootSound("Elevator Sound.wav");
    GreenfootSound announcementSystem = new GreenfootSound("PA Announcement Sound Effect.wav");
    GreenfootSound siren = new GreenfootSound("Code Blue Alarm.wav");
    GreenfootSound powerOn = new GreenfootSound("Search Spotlight Turn On Sound Effect.wav");
    GreenfootSound heartBeat = new GreenfootSound("Heart Beat.wav");
    GreenfootSound ghostlySigh = new GreenfootSound("Ghost Sound - Sigh.wav");
    GreenfootSound rattleDoorHandle = new GreenfootSound("DOOR HANDLE SHAKE (HD SOUND EFFECT).wav");
    GreenfootSound staticNoise = new GreenfootSound("TV static noise HD 1080p.wav");    
    GreenfootSound creepySuspense = new GreenfootSound("Cinematic Suspense Riser - Sound Effect (HD).wav");
    GreenfootSound lightFlickers = new GreenfootSound("Light Flicker Sound Effect.wav");
    
    
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
    
    int x = 340;
    int y = 120;
    
    int mouseClicks = 0;
    
    /**
     * Constructor for objects of class CopyOfIntroductory.
     * 
     */
    public Introductory()
    {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
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
            Reader.readInto(callGrandma, "https://gist.githubusercontent.com/SameerHidery/201137d60ce73adcccd664dc80a358c4/raw/ba097080b2d1b59272d8343783d67997856a86f5/GrandmaCall");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(callMom, "https://gist.githubusercontent.com/SameerHidery/27fbaf4d077166f6712c91830904e125/raw/71306ad61b40fe637c563d9eccf2ed10dd9bc3d5/callMom");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(callManager, "https://gist.githubusercontent.com/SameerHidery/a88a3424d274cd5c4081d953bed64db7/raw/59cba891b86546ff2d0a6ddf798033793e0b7066/callManager");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(viewFax, "https://gist.githubusercontent.com/SameerHidery/3e9159699cedd84e2d26fa1f9963d7bd/raw/11434a579ad08a413c5c3d1d6cd4eab609510506/ViewFax");
            } catch(Exception e) {
        }      
        try{
            Reader.readInto(runToStairwell, "https://gist.githubusercontent.com/SameerHidery/f248d7f7370b88ff82de0a14b0bfafba/raw/0b94db914b27c886afe9ec904e198ca3bd30195f/runToStairwell");
            } catch(Exception e) {
        }
        try{
            Reader.readInto(runToElevator, "https://gist.githubusercontent.com/SameerHidery/911d96469925c84c3a0a96221c4e499b/raw/1fa430ca8792fdd2daa5b2da8289283de4a3d859/runToElevator");
            } catch(Exception e) {
        }
        
        addObject(storyLabel1, x, y);
        addObject(storyLabel2, x, y + 30);
        addObject(storyLabel3, x, y + 60);
        addObject(storyLabel4, x, y + 90);
        
        keyboard.setVolume(50);
        elevator.setVolume(20);
        siren.setVolume(30);
        heartBeat.setVolume(30);
        ghostlySigh.setVolume(40);
        rattleDoorHandle.setVolume(50);
        creepySuspense.setVolume(30);
        staticNoise.setVolume(25);
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
                fifth = decisions.get("six");
            }
        }
        
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
                fifth = decisions.get("six");
            }
            
        }
        /**
         * The story continues after the put on headphones choice
         */
        if(part == 1){
            if(!withHeadphones.isEmpty() && first == true && Greenfoot.mouseClicked(null)){
                mouseClicks++;
                if(mouseClicks == 1){
                    TitleScreen.rainAndThunder.setVolume(30);
                }
                if(mouseClicks == 2){
                    TitleScreen.rainAndThunder.setVolume(40);
                }
                if(mouseClicks == 5){
                    heartBeat.play();
                }
                if(mouseClicks == 6){
                    heartBeat.stop();
                    powerDown.play();
                    powerDown.setVolume(50);
                    setBackground(new GreenfootImage("Dark Theme.png"));
                    TitleScreen.rainAndThunder.setVolume(30);
                }
                if(mouseClicks == 7){
                    powerDown.stop();
                    ghostlySigh.play();
                }
                if(mouseClicks == 8){
                    setBackground(new GreenfootImage("Alarm Theme.png"));
                    siren.setVolume(20);
                }
                if(mouseClicks == 10){
                    siren.setVolume(30);
                }
                if(mouseClicks == 11){
                    rattleDoorHandle.play();
                }
                if(mouseClicks >= 8){
                    siren.play();
                }
                print(withHeadphones);
                if(withHeadphones.isEmpty()){
                    addButtons();
                    choice1.setValue("Turn it off");
                    choice2.setValue("Keep it on");
                    mouseClicks = 0;
                }
            }
            if(!noHeadphones.isEmpty() && first == false && Greenfoot.mouseClicked(null)){
                mouseClicks++;
                if(mouseClicks == 2){
                    TitleScreen.rainAndThunder.setVolume(30);
                    keyboard.play();
                }
                if(mouseClicks == 3){
                    TitleScreen.rainAndThunder.setVolume(40);
                    keyboard.stop();
                    elevator.play();
                }
                if(mouseClicks == 4){
                    elevator.stop();
                    powerDown.play();
                    setBackground(new GreenfootImage("Dark Theme.png"));
                }
                if(mouseClicks == 5){
                    powerDown.stop();
                    announcementSystem.play();
                }
                if(mouseClicks == 6){
                    powerOn.play();
                    setBackground(new GreenfootImage("Alarm Theme.png"));
                }
                if(mouseClicks == 7){
                    powerOn.stop();
                    siren.play();
                }
                print(noHeadphones);
                if(noHeadphones.isEmpty()){
                    addButtons();
                    choice1.setValue("Turn it off");
                    choice2.setValue("Keep it on"); 
                    mouseClicks = 0;
                }
            }
        }
        
        //make the siren keep playing unless player decided to turn it off
        if(part >= 2){
            if(second == false){
                siren.play();
            }
            else{
                siren.stop();
            }
        }
        
        if(part == 2){
            if(!offLockdown.isEmpty() && second == true && Greenfoot.mouseClicked(null)){
                mouseClicks++;
                if(mouseClicks == 2)
                {
                    setBackground(new GreenfootImage("Light Theme.png"));
                    powerOn.play();
                }
                print(offLockdown);
                if(offLockdown.isEmpty()){
                    addButtons();
                    choice1.setValue("Mother");
                    choice2.setValue("Grandma");
                    mouseClicks = 0;
                }
            }
            if(!onLockdown.isEmpty() && second == false && Greenfoot.mouseClicked(null)){
                mouseClicks++;
                if(mouseClicks == 3 || mouseClicks == 4){
                    staticNoise.play();
                }
                if(mouseClicks == 5){
                    staticNoise.stop();
                }
                if(mouseClicks == 7){
                    lightFlickers.play();
                    setBackground(new GreenfootImage("Dark Theme.png"));
                }
                if(mouseClicks == 8){
                    lightFlickers.stop();
                }
                print(onLockdown);
                if(onLockdown.isEmpty()){
                    addButtons();
                    choice1.setValue("Yell at him");
                    choice2.setValue("Complain");
                    mouseClicks = 0;
                }
            }
        }
        if(part == 3 && second == true){
            if(!callMom.isEmpty() && third == true && Greenfoot.mouseClicked(null))
            {
                mouseClicks++;
                if(mouseClicks == 2){
                    staticNoise.play();
                }
                if(mouseClicks == 3){
                    staticNoise.setVolume(40);
                }
                print(callMom);
            }
            if(!callGrandma.isEmpty() && third == false && Greenfoot.mouseClicked(null))
            {
                mouseClicks++;
                if(mouseClicks == 9){
                    creepySuspense.play();
                }
                print(callGrandma);
            }
            if(callMom.isEmpty() || callGrandma.isEmpty()){
                staticNoise.stop();
                gameLost();
                mouseClicks = 0;
            }
        }
        if(part == 3 && second == false){
            if(!callManager.isEmpty() && (third == true || third == false) && Greenfoot.mouseClicked(null)){
                mouseClicks++;
                if(mouseClicks == 9){
                    staticNoise.play();
                }
                if(mouseClicks == 10){
                    staticNoise.stop();
                }
                print(callManager);
                if(callManager.isEmpty()){
                    addButtons();
                    choice1.setValue("View fax");
                    choice2.setValue("Run to...");
                    mouseClicks = 0;
                }
            }
        }
        if(part == 4)
        {
            if(!viewFax.isEmpty() && fourth == true && Greenfoot.mouseClicked(null))
            {
                print(viewFax);
                if(viewFax.isEmpty())
                {
                    gameWon();
                }
            }
            if(fourth == false && Greenfoot.mouseClicked(null))
            {
                nextText("Run to...");
                addButtons();
                choice1.setValue("Stairwell");
                choice2.setValue("Elevator");
            }
        }  
        if(part == 5)
        {
            if(!runToStairwell.isEmpty() && fifth == true && Greenfoot.mouseClicked(null))
            {
                mouseClicks++;
                if(mouseClicks == 2){
                    rattleDoorHandle.play();
                }
                if(mouseClicks == 10){
                    siren.setVolume(15);
                }
                print(runToStairwell);
                if(runToStairwell.isEmpty())
                {
                    gameWon();
                    mouseClicks = 0;
                }
            }
            if(!runToElevator.isEmpty() && fifth == false && Greenfoot.mouseClicked(null))
            {
                mouseClicks++;
                if(mouseClicks == 3){
                    setBackground(new GreenfootImage("Light Theme.png"));
                    second = true;
                }
                if(mouseClicks == 7){
                    creepySuspense.play();
                }
                print(runToElevator);
                if(runToElevator.isEmpty())
                {
                    gameLost();
                }
            }
        }
    }
    public void gameLost()
    {
        LostScreen lose = new LostScreen();
        Greenfoot.setWorld(lose);
    }
    public void gameWon()
    {
        WinScreen win = new WinScreen();
        Greenfoot.setWorld(win);
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


