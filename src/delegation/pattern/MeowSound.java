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
public class MeowSound implements ISoundBehaviour {

        public void makeSound() {
                System.out.println("Meow");
        }
}