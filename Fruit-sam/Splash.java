import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Splash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splash extends Actor
{
    /**
     * Act - do whatever the Splash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timer=0;
    public void act()
    {
        timer++;
        if (timer == 15) {
            getWorld().removeObject(this);
        }
    }
}
