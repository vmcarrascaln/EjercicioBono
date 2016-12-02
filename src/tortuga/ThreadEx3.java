package tortuga;

//ThreadEx3.java

import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx3 extends TurtleFrame
{
    public void simular(){
        Turtle hilo1 = new Turtle(this, Color.BLACK);
        Turtle hilo2 = new Turtle(this, Color.red);
        Turtle hilo3 = new Turtle(this, Color.green);
        Turtle hilo4 = new Turtle (this,Color.blue);
        Turtle hilo5 = new Turtle(this, Color.YELLOW);
        
                
        hilo1.setPos(-30, 100);
        hilo2.setPos(-50, -40);
        hilo3.setPos(-30, -40);
        hilo4.setPos(50,50);
        hilo5.setPos(-5,230);
        hilo5.setPos(-5,150);
        
        
        hilo1.setPenColor(Color.black);
        hilo2.setPenColor(Color.red);
        hilo3.setPenColor(Color.green);
        hilo4.setPenColor(Color.blue);
        hilo5.setPenColor(Color.yellow);
        
        hilo5.forward(10);
        
        new Cuadrado(hilo1).start();
        new Linea(hilo3).start();
        new Cuadrado(hilo2).start();
        new Linea(hilo4).start();
        new Linea(hilo5).start();
    }


public static void main(String[] args)
{
   ThreadEx3 tablero =  new ThreadEx3();
   tablero.simular();
}
}