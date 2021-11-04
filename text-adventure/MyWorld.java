import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        
        handphone main = new handphone();
        addObject(main, 950, getHeight()/2);

        
    }
    
    public void keyPad()
    {
        buttonOne one = new buttonOne();
        if(handphone.screenDisplay == 0)
        {
            deleteBut del = new deleteBut();
            addObject(del, 860, 615);
            
            addObject(one, 855, 270);
            
            buttonTwo two = new buttonTwo();
            addObject(two, 950, 270);
            
            buttonThree three = new buttonThree();
            addObject(three, 1045, 270);
                    
            buttonFour four = new buttonFour();
            addObject(four, 855, 367);
                    
            buttonFive five = new buttonFive();
            addObject(five, 950, 367);
                    
            buttonSix six = new buttonSix();
            addObject(six, 1045, 367);
                    
            buttonSeven seven = new buttonSeven();
            addObject(seven, 855, 464);
                    
            buttonEight eight = new buttonEight();
            addObject(eight, 950, 464);
                    
            buttonNine nine = new buttonNine();
            addObject(nine, 1045, 464);
                    
            buttonZero zero = new buttonZero();
            addObject(zero, 950, 561);
        }
        if(handphone.screenDisplay==1)
        {
            removeObject(one);
        }
        
        
    }


    

}
