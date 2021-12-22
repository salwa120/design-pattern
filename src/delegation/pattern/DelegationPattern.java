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
public class DelegationPattern {

    /**
     * @param args the command line arguments
     */
       public static void main(String args[]) {
                Cat c = new Cat();
                // Delegation
                c.makeSound();          // Output: Meow
               //now to change the sound it makes
                ISoundBehaviour newsound = new RoarSound();
                c.setSoundBehaviour(newsound);
                //Delegation           
                c.makeSound(); // Output: Roar!
                Dog d = new Dog();
                // Delegation
                d.makeSound();    // Output: bau bau
        }
}