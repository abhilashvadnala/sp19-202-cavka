import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Subject
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int health=200;
    private int damage;
    private GreenfootImage img;
    
    public void addedToWorld(World world)
    {
        img=getImage();
    }
    public void act() 
    {
        // Add your action code here.
        if(health<=0)
        die(this);
    }    
    
    public void causeDamage(ISubject s)
    {
        health = accept(visitor);
        System.out.println("wall health: "+health);  
       if(s instanceof Undead)
       {
           damage=s.getDamage();
         //  health=health-damage;
           
           int aq=(int)(health/2);
           
           int transPercent=(int)((aq*255)/100);
           
          // System.err.println("wall calc transparency: "+transPercent);

          // System.err.println("wall transparency before : "+img.getTransparency());
           img.setTransparency(transPercent);
           //System.err.println("wall transparency after: "+img.getTransparency());

       }
       else if(s instanceof NightKing)
       {
           damage=s.getDamage();
         //  health=health-damage;
           
       }
       HealthSet(damage);
    }
    
    public void HealthSet(int val)
    {
        notifyObserver(this);
    }
    
    public int getHealth()
    {
        return damage;
    }
    
       public int getDamage()
    {
        return damage;
    }
    
    public void setDamage(int val)
    {
        this.damage=val;
    }
    
    public boolean isKilledByMan()
    {
        return false;
    }
}
