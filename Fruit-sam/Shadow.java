import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shadow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shadow extends Actor
{
    int opacity = 240;
    public Shadow()
    {
    }
    public Shadow(GreenfootImage image){
        GreenfootImage Image = new GreenfootImage(image);
        setImage(Image);
    }
    public void act() 
    {
        getImage().setTransparency(opacity);
        if (opacity!=0){
            opacity-=20;
        }else{
            getWorld().removeObject(this);
        }
    }
}
