import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends Actor
{
    
    int count = 0 ;
    GreenfootImage img;
    public Instruction(){
        
    }
    
    /**
     * Act - do whatever the Instruction wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }    
    
    public void setValue(IStrategy val)
    {
        
        String s= val.getClass().getName().replace("LevelStrategy","");
        img = new GreenfootImage("Count : "+s, 20, 
                                    Color.WHITE, Color.BLACK);
        setImage(img);
    }
}