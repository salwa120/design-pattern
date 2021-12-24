/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorpattern;

/**
 *
 * @author  Calypso Computers
 */
public class Rectangle extends Dot implements Shape {
    
    private int width;
    private int height;

    public Rectangle(int id, int x, int y, int width, int height) {
        super(id, x, y);
        this.width = width;
        this.height = height;
    }



    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

   

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}