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
    passIndex[] circle = new passIndex[4];
    ContactList[] list = new ContactList[3];
    
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
    
    public void run()
    {
        
    }
    
    public void keyPad()
    {
        if(handphone.screenDisplay == 0)
        {

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
            
            circle = new passIndex[4];
            for(int j =0; j < 4; j++)
            {
                circle[j]= new passIndex();
            }
            addObject(circle[0], 905, 215);
            addObject(circle[1], 935, 215);
            addObject(circle[2], 965, 215);
            addObject(circle[3], 995, 215);
        }
        // Player got the password correct
        else if(handphone.screenDisplay==1)
        {  
            for(ButtonKey key : keys)
            {
                removeObject(key);
            }
            for(passIndex select : circle)
            {
                removeObject(select);
            }
            addObject(new PhoneApp(), 853, 627);
        }

    }
    
    public void openContacts()
    {
        list = new ContactList[3];
        for(int c = 0; c<3; c++)
        {
            list[c] = new ContactList(c);
        }
        
        addObject(list[0], 947, 216);
        addObject(list[1], 947, 371);
        addObject(list[2], 947, 531);
        
    }
    
    public void closeContacts()
    {
        for(ContactList all : list)
        {
            removeObject(all);
        }
    }


    

}
