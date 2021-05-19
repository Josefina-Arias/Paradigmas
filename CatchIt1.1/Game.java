import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    public static Counter JugadorLifeCount= new Counter();
    public static Counter comidaCount= new Counter();
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        /**
         * Instanciacion del Player1
         */
        
        addObject(new Jugador(),300, 200);
        /**
         * Instanciacion del contador de vidas
         */
        addObject(JugadorLifeCount,80, 30);
        JugadorLifeCount.setValue(3);
        /**
         * Instanciacion del contador de comida
         */
        addObject(comidaCount,550, 30);
        comidaCount.setValue(0);
        //enemigoif
        crearEnemy(1); 
        
        
      
        
        /**
         * Instanciacion de los obstaculos
         */
        
        addObject(new Obstaculo(),40, 300);   
        addObject(new Obstaculo(),10, 300);       
        addObject(new Obstaculo(),80, 300);       
        addObject(new Obstaculo(),120, 300);
        addObject(new Obstaculo(),100, 200);
        addObject(new Obstaculo(),125, 200);
        addObject(new Obstaculo(),150, 200);
        addObject(new Obstaculo(),175, 200);
        addObject(new Obstaculo(),200, 200);
        addObject(new Obstaculo(),225, 200);
        addObject(new Obstaculo(),250, 200);        
        addObject(new Obstaculo(),400, 80);       
        addObject(new Obstaculo(),530, 280);        
        addObject(new Obstaculo(),500, 300);       
        addObject(new Obstaculo(),400, 200); 
        addObject(new Obstaculo(),425, 200);
        addObject(new Obstaculo(),450, 200);
        
        addObject(new Obstaculo(),125, 100);
        addObject(new Obstaculo(),150, 100);
       // addObject(new Obstaculo(),150, 125);
      //addObject(new Obstaculo(),150, 150);
        //addObject(new Obstaculo(),150, 175);
        addObject(new Obstaculo(),175, 100);
        addObject(new Obstaculo(),100, 100);
        addObject(new Obstaculo(),75, 100);
        addObject(new Obstaculo(),50, 100);
        addObject(new Obstaculo(),25, 100);                
        addObject(new Obstaculo(),500, 340);        
        addObject(new Obstaculo(),500, 380);        
        addObject(new Obstaculo(),440, 80);        
        addObject(new Obstaculo(),470, 80);        
        addObject(new Obstaculo(),200, 100);
        addObject(new Obstaculo(),225, 100);
        addObject(new Obstaculo(),250, 100);
        addObject(new Obstaculo(),275, 100);
        addObject(new Obstaculo(),300, 100);
        addObject(new Obstaculo(),300, 75);
        addObject(new Obstaculo(),300, 50);                
        addObject(new Obstaculo(),470, 100);      
        addObject(new Obstaculo(),470, 130);      
        addObject(new Obstaculo(),470, 150);                
        addObject(new Obstaculo(),470, 300);
        addObject(new Obstaculo(),445, 300);
        addObject(new Obstaculo(),420, 300);
        addObject(new Obstaculo(),395, 300);      
        addObject(new Obstaculo(),520, 180);       
        addObject(new Obstaculo(),540, 180);         
        addObject(new Obstaculo(),570, 180);         
        addObject(new Obstaculo(),480, 180);   
        addObject(new Obstaculo(),315, 380);       
        addObject(new Obstaculo(),315, 340);       
        addObject(new Obstaculo(),315, 300);
        addObject(new Obstaculo(),80, 270);
        addObject(new Obstaculo(),80, 240);
        addObject(new Obstaculo(),80, 210);
        //addObject(new Obstaculo(),80, 180);
        addObject(new Obstaculo(),150, 300);
        addObject(new Obstaculo(),270, 300);
        addObject(new Obstaculo(),235, 300);
        addObject(new Obstaculo(),235, 325);
        addObject(new Obstaculo(),235, 350);
        addObject(new Obstaculo(),150, 325);
        addObject(new Obstaculo(),150, 350);
        /**
         * Instanciacion de la comida
         */
        Comida comida1=new Comida();
        addObject(comida1,550, 350);
        Comida comida2=new Comida();
        addObject(comida2,550, 120);
       Comida comida3=new Comida();
       addObject(comida3,50, 370);
      
       
       
   
            
    
    }
    /**
     * este metodo crea el numero de enemigos que nosotros queramos
     */
    public  void crearEnemy(int n){
        for (int i=0; i<n; i++){
            Enemigo e=new Enemigo();
            int x=0;
            int y=0;
            addObject(e,x,y);
        }
        
    }
}
