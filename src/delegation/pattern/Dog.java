/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegation.pattern;

/**
 *
 * @author Calypso Computers
 */
public class Dog {
  private ISoundBehaviour sound = new BarkSound();  

  public void makeSound() {  
    this.sound.makeSound();  
  }  

  public void setSoundBehaviour(ISoundBehaviour newsound) {  
        this.sound = newsound;  
  }  
}
