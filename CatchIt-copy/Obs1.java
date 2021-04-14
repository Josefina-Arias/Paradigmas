import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obs1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obs1 extends Actor
{
    /**
     * Act - do whatever the Obs1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /*
     * este metodo reduce el tamano del objeto "Obs1" a la mitad.
     */
    public Obs1(){
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
      
}
