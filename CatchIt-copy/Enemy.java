
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(){
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    public void act() 
    {
        /*
         * Esta linea de codigo se encarga del los pixeles que se mueve el 
         * 
         * 
         */
        move(7);
        World m = getWorld();
        /*
         * Estas condicionales se encargan de dar movimiento y rotacion 
         * aleatoria  al objeto "Enemy"
         */
        if (getX()>=m.getWidth()-5|| getX()<=5){
            turn (180) ;
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        if (getY()>=m.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
        }
    } 
    /*
     * Esta linea de codigo indica que el jugador "Player1" colicionó con el 
     * "Enemy"
     */
    Actor Player1=getOneObjectAtOffset(0,0,Player1.class);
    /*
     * La primer condicion indica que cada vez que el "Player1" toque al "Enemy"
     * el "Player1"desaparecerá, se restará una vida al contador de vidas y
     * si aún quedan vidas disponebles el "Player1" reaparecerá en el centro
     * del mapa.
     * la segunda condicion es valida para cuando las vidas del "Player1" se 
     * han agotado, cuando el contador de vidas llega a cero, el "Player1"
     * desaparece del mapa y se retorna al menú del juego.
     */
    if(Player1!=null){
        MyWorld world=(MyWorld)getWorld();
        getWorld().removeObject(Player1);
        getWorld().addObject(Player1,300,200);
        MyWorld.player1LifeCount.add(-1);
        if(MyWorld.player1LifeCount.getValue() ==0){
            
            Greenfoot.setWorld(new Menu());
        }
        
        
    }
    
}
}
