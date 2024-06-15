import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    private Spawner spawner;

    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        if (Greenfoot.mouseClicked(this)){
            startGame();
        }
    }

    private void startGame() {
        World world = getWorld();
        world.removeObjects(world.getObjects(Fruit.class));
        world.removeObjects(world.getObjects(Gameover.class));
        world.removeObjects(world.getObjects(Katana.class));
        world.removeObjects(world.getObjects(Bomb.class));
        world.removeObjects(world.getObjects(Score.class));
        world.removeObjects(world.getObjects(Logo.class));
        world.showText("", world.getWidth() / 2, world.getHeight() / 2 + 75);

        spawner = new Spawner();
        world.addObject(spawner, 0, 0);  // Tambahkan spawner ke dunia di lokasi yang tidak terlihat
        spawner.spawnInitialFruits();  // Panggil metode untuk menambahkan buah awal
        spawner.spawnInitialBombs();  // Panggil metode untuk menambahkan bom awal
        
        world.addObject(new Katana(), 400, 270);
        world.addObject(new Score(), 80, 65);
        Score.skor = 0;
        world.removeObject(this);
    }
}
