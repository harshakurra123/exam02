/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author S542409
 */
public class Circle {
    private int perimeter;
    
    public Circle(int perimeter) {
        this.perimeter = perimeter;
    }
    
    @Override
    public String toString(){
        return "Perimeter of circle is:" + perimeter;
    }
}
