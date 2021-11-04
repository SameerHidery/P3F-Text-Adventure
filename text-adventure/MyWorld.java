import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    ButtonKey[] keys = new ButtonKey[10];
    
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
        
        if(handphone.screenDisplay == 0)
        {
            deleteBut del = new deleteBut();
            addObject(del, 860, 615);
            
            keys = new ButtonKey[10];
            for(int i = 0; i < 10; i++)
            {
                keys[i] = new ButtonKey(i);
            }
            
            addObject(keys[1], 855, 270);
            addObject(keys[2], 950, 270);
            addObject(keys[3], 1045, 270);
            addObject(keys[4], 855, 367);
            addObject(keys[5], 950, 367);
            addObject(keys[6], 1045, 367);
            addObject(keys[7], 855, 464);
            addObject(keys[8], 950, 464);
            addObject(keys[9], 1045, 464);
            addObject(keys[0], 950, 561);
        }
        
        // Player got the password correct
        if(handphone.screenDisplay==1)
        {  
            for(ButtonKey key : keys)
            {
                removeObject(key);
            }
        }
        
        
    }


    

}
