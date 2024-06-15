import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spawner extends Actor
{
    private int timer = 0;
    private final int spawnInterval = 200; // interval untuk menambahkan buah dan bom baru

    public void act() {
        timer--;
        if (timer <= 0) {
            spawnFruits();
            spawnBombs();
            timer = spawnInterval;
        }
    }

    public void spawnInitialFruits() {
        int numFruits = Greenfoot.getRandomNumber(5); // Random number between 1 and 3
        for (int i = 0; i < numFruits; i++) {
            getWorld().addObject(new Fruit(Greenfoot.getRandomNumber(6)), 20 + Greenfoot.getRandomNumber(580), 530);
        }
    }

    public void spawnInitialBombs() {
        int numBombs = Greenfoot.getRandomNumber(3); // Random number between 1 and 3
        for (int i = 0; i < numBombs; i++) {
            getWorld().addObject(new Bomb(), 20 + Greenfoot.getRandomNumber(580), 530);
        }
    }

    private void spawnFruits() {
        int numFruits = Greenfoot.getRandomNumber(5); // Random number between 1 and 3
        for (int i = 0; i < numFruits; i++) {
            getWorld().addObject(new Fruit(Greenfoot.getRandomNumber(6)), 20 + Greenfoot.getRandomNumber(580), 530);
        }
    }

    private void spawnBombs() {
        int numBombs = Greenfoot.getRandomNumber(3); // Random number between 1 and 3
        for (int i = 0; i < numBombs; i++) {
            getWorld().addObject(new Bomb(), 20 + Greenfoot.getRandomNumber(580), 530);
        }
    }
}