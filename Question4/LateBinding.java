/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author S542409
 */
public class LateBinding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 4: Harshavardhan Kurra");
        Parent parentObject = new Parent();
        Parent childObject = new Child();
        
        System.out.println(parentObject.getStr());
        System.out.println(childObject.getStr());
    }
    
}
