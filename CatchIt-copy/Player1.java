
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /*
     * Este metodo se encarga de reducir a la mitad el tamano del "Player1"
     */
    public Player1(){
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    public void act() 
    {
        /*
         * Este codigo se encarga del movimiento del isecto a travez de las ordenes que el jugador indique a travez del teclado y se implementa el metodo 
         * "golpearobstaculos" para que cada vez que el Player1 toque un objetos de tipo Obs1 el Player1 no pueda avanzar hasta rodear el Obs1.
         */
        if(Greenfoot.isKeyDown("right")){
         setLocation(getX() +4, getY());
         if(golpearobstaculos())
         {setLocation(getX() -4, getY());
            }
            
        }
        if(Greenfoot.isKeyDown("left")){
         setLocation(getX() -4, getY());
         if(golpearobstaculos())
         {setLocation(getX() +4, getY());
            }
        }
         if(Greenfoot.isKeyDown("up")){
         setLocation(getX(), getY() -4);
         if(golpearobstaculos())
         {setLocation(getX() , getY()+4);
            }
        }
        if(Greenfoot.isKeyDown("down")){
         setLocation(getX(), getY() +4); 
         if(golpearobstaculos())
         {setLocation(getX() , getY()-4);
            }
        }
        /*
         * Este codigo se encarga de hacer rotar el inceto cada vez que el "Player1" cambie de direccion
         */
        
        /**
         * Se hace un llamado a la clase Comida y a la clase Enemy
         */
        Actor Comida;
        Actor Enemy;
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
            MyWorld world=(MyWorld)getWorld();
            MyWorld.comidaCount.add(1);
            if(MyWorld.comidaCount.getValue()==3)
            {getWorld().addObject(new Enemy(),0,0);
                getWorld().addObject(new Comida(),270,350);
                getWorld().addObject(new Comida(),40,250);
                getWorld().addObject(new Comida(),200,150);
            }
            if(MyWorld.comidaCount.getValue()==6)
            {getWorld().addObject(new Enemy(),0,0);
                getWorld().addObject(new Comida(),150,50);
                getWorld().addObject(new Comida(),550,350); 
                getWorld().addObject(new Comida(),550,120);
            }
            if(MyWorld.comidaCount.getValue()==9)
            {getWorld().addObject(new Enemy(),246,531);
                getWorld().addObject(new Comida(),25,150);
                getWorld().addObject(new Comida(),25,350);
                getWorld().addObject(new Comida(),375,500);
            }if(MyWorld.comidaCount.getValue()==12)
            {Greenfoot.setWorld(new triunfo());
            }
            
            getWorld().removeObject(Comida);
            
        }
       
        
    }
    /**
     * Este metodo es el encargado de indicar si el jugador toca un obstaculo a no.
     */
     public boolean golpearobstaculos(){
            if (isTouching(Obs1.class)){
                return true;
            }
            
            else {
                return false; 
            }
        }
}
