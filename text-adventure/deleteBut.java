import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class deleteBut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class deleteBut extends Actor
{
    public deleteBut()
    {
        GreenfootImage image = getImage();
        image.scale(115,50);
        setImage(image);
    }
    /**
     * Act - do whatever the deleteBut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println("----");
            int a = handphone.playerPass[0];
            int b = handphone.playerPass[1];
            int c = handphone.playerPass[2];
            int d = handphone.playerPass[3];
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(handphone.numPass);
        }
    }    
}
