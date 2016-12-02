/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortuga;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class Cuadrado extends Thread{
  private Turtle turtle;

  Cuadrado(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
   for (int i = 0; i < 4; i++)
     segment(turtle);
 }

 private void segment(Turtle t)
 {
     t.forward(50);
     t.right(90);
     
 }
}
