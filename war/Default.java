import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Default here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Default extends World
{

    /**
     * Constructor for objects of class Default.
     * 
     */
    static GameStateMachine sm;
    public Default()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        sm = new GameStateMachine();
    }
}
