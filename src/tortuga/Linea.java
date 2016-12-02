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
public class Linea extends Thread{
  private Turtle turtle;

  Linea(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run()
 {
     this.turtle.back(100);
 }

}
