import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Katana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Katana extends Actor
{
    /**
     * Act - do whatever the Katana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     **/
     static boolean shadowImagery = true;
     int bombTime = 0;
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mousePressed(this))
        {
          getImage().setTransparency(200);
        }
        else if(Greenfoot.mouseClicked(this))
        {
          getImage().setTransparency(0);
        }
        
        // Follow the mouse
        if(Greenfoot.mouseDragged(null)) {
            if (shadowImagery==true){
               getWorld().addObject(new Shadow(getImage()),getX(),getY());}
            
            setLocation(mouse.getX(), mouse.getY());
        }
        
        if (mouse != null){
        setLocation(mouse.getX(), mouse.getY());
        }
        
        bombTime++;
        if (bombTime == 200){
            getWorld().addObject(new Bomb(), 5+Greenfoot.getRandomNumber(770), 537);
            bombTime=0;
        }
    
        slashed();
    
    }
    
    void slashed() {
        if(Greenfoot.mouseDragged(null)){
            Fruit f = (Fruit) getOneIntersectingObject(Fruit.class);
            if (f != null){
            splashFruit();
            Score.skor++;
            getWorld().removeObject(f);
        }
        
        if(Greenfoot.mouseDragged(null)){
            Bomb b = (Bomb) getOneIntersectingObject(Bomb.class);
            if (b != null){
            Explode();
            getWorld().removeObject(b);
        }
        }
    }
    }
    
    void splashFruit() {
        Greenfoot.playSound("fruitSplashes.wav");
        
        getWorld().addObject(new Fruit(Greenfoot.getRandomNumber(6)), 20+Greenfoot.getRandomNumber(580), 530);
        getWorld().addObject(new Splash(), getX(), getY());
    }
    
    void Explode() {
        Greenfoot.playSound("blast.wav");
        getWorld().addObject(new Explosion(), getX(), getY());
        getWorld().addObject(new Gameover(), 400, 250);
        getWorld().addObject(new Play(), 400, 400);
        Greenfoot.stop();
    }
}
