import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class triunfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class triunfo extends World
{

    /**
     * Constructor for objects of class triunfo.
     * 
     */
    public triunfo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new win(),300,200);
    }
}
