import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */




public class Menu extends World
{
    Flecha flecha = new Flecha();
    private int opcion = 0;
    //GreenfootSound myMusic= new GreenfootSound("song.mpeg");
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepararMundo ();
        
    }
    
    private void prepararMundo () {
        addObject (new Jugar(), 400, 300);
        addObject (new Salir(), 400, 350);
        addObject (flecha, 175, 300);
        
    }
    
    public void act (){
     if (Greenfoot.isKeyDown("UP") && opcion!=0) {opcion++;}  
     if (Greenfoot.isKeyDown("DOWN") && opcion!=1) {opcion--;}
     
     if (opcion>=2) opcion=0;
     if (opcion<0) opcion=1;
     
     flecha.setLocation(175,300+(opcion*50));
     
     if (Greenfoot.isKeyDown("ESPACE") || Greenfoot.isKeyDown("ENTER")) {
         switch(opcion){
             case 0:
                Greenfoot.setWorld(new Game());
                    break;
             case 1:
                Greenfoot.stop();
                break;
             
            }
        }
    }
        
}
