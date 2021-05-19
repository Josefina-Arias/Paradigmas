import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Jugador(){
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    public void act() 
    {
        /*
         * Este codigo se encarga del movimiento del isecto a travez de las ordenes que el jugador indique a travez del teclado y se implementa el metodo 
         * "golpearobstaculos" para que cada vez que el Player1 toque un objetos de tipo Obs1 el Player1 no pueda avanzar hasta rodear el Obs1.
         */
        if(Greenfoot.isKeyDown("right")){
         setLocation(getX() +3, getY());
         if(golpearobstaculos())
         {setLocation(getX() -3, getY());
            }
            
        }
        if(Greenfoot.isKeyDown("left")){
         setLocation(getX() -3, getY());
         if(golpearobstaculos())
         {setLocation(getX() +3, getY());
            }
        }
         if(Greenfoot.isKeyDown("up")){
         setLocation(getX(), getY() -3);
         if(golpearobstaculos())
         {setLocation(getX() , getY()+3);
            }
        }
        if(Greenfoot.isKeyDown("down")){
         setLocation(getX(), getY() +3); 
         if(golpearobstaculos())
         {setLocation(getX() , getY()-3);
            }
        }
        /*
         * Este codigo se encarga de hacer rotar el inceto cada vez que el "Player1" cambie de direccion
         */
        /*if(Greenfoot.isKeyDown("right")) {
            setRotation(0);
        }
         if(Greenfoot.isKeyDown("left")) {
            setRotation(180);
        }
         if(Greenfoot.isKeyDown("up")) {
            setRotation(-90);
        }
         if(Greenfoot.isKeyDown("down")) {
            setRotation(90);
        }*/
      
        /**
         * Se hace un llamado a la clase Comida y a la clase Enemy
         */
        Actor Comida;
        Actor Enemigo;
        /**
         * Esta linea de codigo indica que el "Player1" ha colicionado con un objeto de tipo Comida
         * 
         */
        Comida=getOneObjectAtOffset(0,0,Comida.class);
        /**
         * El primer condicional indica que cada vez que Player1 toque un objeto Comida, el contador de comida aunmeta en una unidad.
         * El segundo condicional se encarga que cuando el contador de comida sea igual a 3 se crearán nuevo objetos de tipo comida y un nuyevo Enemy se 
         * sumará al mapa.
         * El tercer condicional se encarga que cuando el contador de comida sea igual a 6 se crearán nuevo objetos de tipo comida y un nuyevo Enemy se 
         * sumará al mapa.
         * El tercer condicional se encarga que cuando el contador de comida sea igual a 9 se crearán nuevo objetos de tipo comida y un nuyevo Enemy se 
         * sumará al mapa.
         * El cuarto condicional se encarga que cuando el contador de comida sea igual a 12 el jugador habrá ganado la partida. 
         */
        if (Comida != null){
            Game world=(Game)getWorld();
            Game.comidaCount.add(1);
            if(Game.comidaCount.getValue()==3)
            {getWorld().addObject(new Enemigo(),0,0);
                getWorld().addObject(new Comida(),270,350);
                getWorld().addObject(new Comida(),40,250);
                getWorld().addObject(new Comida(),200,150);
            }
            if(Game.comidaCount.getValue()==6)
            {getWorld().addObject(new Enemigo(),0,0);
                getWorld().addObject(new Comida(),150,50);
                getWorld().addObject(new Comida(),550,350); 
                getWorld().addObject(new Comida(),550,120);
            }
            if(Game.comidaCount.getValue()==9)
            {getWorld().addObject(new Enemigo(),246,531);
                getWorld().addObject(new Comida(),25,150);
                getWorld().addObject(new Comida(),25,350);
                getWorld().addObject(new Comida(),375,500);
            }if(Game.comidaCount.getValue()==12)
            {Greenfoot.setWorld(new Menu());
            }
            
            getWorld().removeObject(Comida);
            
        }
       
        
    }
    /**
     * Este metodo es el encargado de indicar si el jugador toca un obstaculo a no.
     */
     public boolean golpearobstaculos(){
            if (isTouching(Obstaculo.class)){
                return true;
            }
            
            else {
                return false; 
            }
        }
}
