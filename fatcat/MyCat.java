import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//Augusto Sanic 20717
/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
       String input = Greenfoot.ask("Quieres que el gato este aburrido, 1 es si y 2 es no (solo pueden ser numeros)");
       int answer = Integer.valueOf(input);
       if (answer == 1){
           setBored(true);
       } 
       else{
           setBored(false);
       }
      

        eat();//7,8 y 9
        dance();
        sleep(4);
        
        dance(); //10 rutina gato
        dance();
        eat();
        sleep(1);
        
        //11
     if (isSleepy())
     { sleep(2);
     }
    
     //12 
     if (isBored())
     {
     dance();
     }
     //13
     if (isHungry())
     {
     eat();
     }
     //14
     //Menciona "for testing" a la hora de probar cambiar el valor de tired true o false es decir setTired(true); o tambien setTired(false); 
     
     if (isSleepy())
     { sleep(1);
     shoutHooray();
     }
     else {shoutHooray();}
     //15
     if (isAlone())
     { sleep(1);
     }
     else {shoutHooray();}
     
    }    
}
