import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barquito1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barquito1 extends Actor
{
    /**
     * Act - do whatever the Barquito1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Barquito1(){
        
    }
    Boolean canFire = true;
    public void act()
    {
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+3, getY());
        }
        else if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-3, getY());
        }
        else if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-3);
        }
        else if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+3);
        }
        
        fireProjectile();
    }

 public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true){
            getWorld().addObject(new Projectile(), getX(), getY()-30);
            canFire = false;
            
        } else if(!Greenfoot.isKeyDown("space")){
            canFire =true;   
        }

    }
}