import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    public static Counter player1LifeCount= new Counter();
    public static Counter comidaCount= new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        /*
         * Instanciacion del Player1
         */
        
        addObject(new Player1(),300, 200);
        /*
         * Instanciacion del contador de vidas
         */
        addObject(player1LifeCount,80, 30);
        player1LifeCount.setValue(3);
        /*
         * Instanciacion del contador de comida
         */
        addObject(comidaCount,550, 30);
        comidaCount.setValue(0);
        //enemigoif
        crearEnemy(0); 
        
        
      
        
        /*
         * Instanciacion de los obstaculos
         */
        
        addObject(new Obs1(),40, 300);   
        addObject(new Obs1(),10, 300);       
        addObject(new Obs1(),80, 300);       
        addObject(new Obs1(),120, 300);        
        addObject(new Obs1(),150, 200);
        addObject(new Obs1(),175, 200);
        addObject(new Obs1(),200, 200);
        addObject(new Obs1(),225, 200);
        addObject(new Obs1(),250, 200);        
        addObject(new Obs1(),400, 80);       
        addObject(new Obs1(),530, 280);        
        addObject(new Obs1(),500, 300);       
        addObject(new Obs1(),400, 200);        
        addObject(new Obs1(),125, 100);
        addObject(new Obs1(),150, 100);
        addObject(new Obs1(),150, 125);
       addObject(new Obs1(),150, 150);
        addObject(new Obs1(),150, 175);
        addObject(new Obs1(),175, 100);
        addObject(new Obs1(),100, 100);
        addObject(new Obs1(),75, 100);
        addObject(new Obs1(),50, 100);
        addObject(new Obs1(),25, 100);                
        addObject(new Obs1(),500, 340);        
        addObject(new Obs1(),500, 380);        
        addObject(new Obs1(),440, 80);        
        addObject(new Obs1(),470, 80);        
        addObject(new Obs1(),200, 100);
        addObject(new Obs1(),225, 100);
        addObject(new Obs1(),250, 100);
        addObject(new Obs1(),275, 100);
        addObject(new Obs1(),300, 100);
        addObject(new Obs1(),300, 75);
        addObject(new Obs1(),300, 50);                
        addObject(new Obs1(),470, 100);      
        addObject(new Obs1(),470, 130);      
        addObject(new Obs1(),470, 150);                
        addObject(new Obs1(),470, 300);
        addObject(new Obs1(),445, 300);
        addObject(new Obs1(),420, 300);
        addObject(new Obs1(),395, 300);      
        addObject(new Obs1(),520, 180);       
        addObject(new Obs1(),540, 180);         
        addObject(new Obs1(),570, 180);         
        addObject(new Obs1(),480, 180);   
        addObject(new Obs1(),315, 380);       
        addObject(new Obs1(),315, 340);       
        addObject(new Obs1(),315, 300);
        addObject(new Obs1(),80, 270);
        addObject(new Obs1(),80, 240);
        addObject(new Obs1(),80, 210);
        addObject(new Obs1(),80, 180);
        addObject(new Obs1(),150, 300);
        addObject(new Obs1(),270, 300);
        addObject(new Obs1(),235, 300);
        addObject(new Obs1(),235, 325);
        addObject(new Obs1(),235, 350);
        addObject(new Obs1(),150, 325);
        addObject(new Obs1(),150, 350);
        /*
         * Instanciacion de la comida
         */
        Comida comida1=new Comida();
        addObject(comida1,550, 350);
        Comida comida2=new Comida();
        addObject(comida2,550, 120);
       Comida comida3=new Comida();
       addObject(comida3,50, 370);
      
       
       
   
            
    }
    /*
     * este metodo crea el numero de enemigos que nosotros queramos
     */
    public  void crearEnemy(int n){
        for (int i=0; i<n; i++){
            Enemy e=new Enemy();
            int x=0;
            int y=0;
            addObject(e,x,y);
        }
        
    }
    
}
