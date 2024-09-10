import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 ******************Space Game*****************
 * 
 *  Ejercicio de Uso Libre
 * 
 *  No se permite la comercializacion de este codigo.
 * 
 *  Realizar ejercicio de programacion de juego, 
 *  en el cual veremos con programacion Orienta a Objeto en Java
 *  Los elementos necesarios para aprender a programar.
 *  Este ejercicio puede mejorarse aun mas en cuestion de codigo
 * 
 * @author Anderson Camacho 
 * @email: camachosinh@gmail.com
 * @version general 1.5
 * 
 * nota: falta docuemtnar despues despues de enemigos.
 * 
 * Nota del desarrollador:
 * 
 * Este codigo fue tomado de canal de o youtube Coding Club 
 * (https://www.youtube.com/c/CodingClub/about) y se 
 * actualizando elementos a codigo estandarizado. 
 */
class Projectile extends Actor
{
    /**
     * Declaraciones
     */
    /**
     * Constructor
     */
    public Projectile()
    {
    }

    /**
     * Metodos getter and setters
     */
    /**
     * Metodos Action que se ejecuta siempre que el objeto exista
     */
    public void act() 
    {
        projectileMove();
        removeFromWorld();
    } 

    /**
     * Metodo preparacion de los elementos de esta Clase
     */
    private void prepare()
    {
    }

    /**
     * Metodos de Projectile completos y con elementos completos no estandares.
     */

    public void projectileMove()
    {
        setLocation(getX(), getY() - 10);
    }

    public void removeFromWorld()
    {
        if(getY() == 0)
        {
            getWorld().removeObject(this);
        }
    }

}