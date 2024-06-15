import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruit extends Actor
{
    /**
     * Act - do whatever the Fruit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       
    private double velocityX;
    private double velocityY;
    private double gravity = 0.3;
    
    public Fruit(int type)
    {
        setImage ("fruit"+type+".png");
        velocityX = Greenfoot.getRandomNumber(6) - 3; // Random horizontal speed
        velocityY = -Greenfoot.getRandomNumber(12) - 5; // Initial upward speed
    }

    public void act() {
        // Update position based on velocity
        setLocation(getX() + (int)velocityX, getY() + (int)velocityY);

        // Apply gravity to the vertical velocity
        velocityY += gravity;

        // Remove fruit if it falls off the bottom of the screen
        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }
}
