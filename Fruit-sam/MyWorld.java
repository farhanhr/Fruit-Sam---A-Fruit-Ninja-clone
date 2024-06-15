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
    private Logo logo;
    GreenfootSound backgroundMusic = new GreenfootSound("japanese.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 540, 1);
        logo = new Logo();
        addObject(logo, getWidth() / 2, getHeight() / 2 - 50);
        addObject(new Play(), 400, 400);
        showText("Dapatkan 100 Point!", getWidth() / 2, getHeight() / 2 + 75);
    }
    @Override
    public void stopped() {
        // Berhenti memutar musik ketika dunia dihentikan
        backgroundMusic.pause();
    }
    @Override
    public void started() {
        // Melanjutkan memutar musik ketika dunia dimulai kembali
        backgroundMusic.setVolume(75);
        backgroundMusic.playLoop();
    }
}
