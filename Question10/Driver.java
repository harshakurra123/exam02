/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author S542409
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 10: Harshavardhan Kurra");
        One hippo = new Three();
        System.out.println(hippo.guess(4));
        System.out.println(hippo.apply(12));

        One lion = new One(-1);
        System.out.println(lion.guess(5));
        System.out.println(lion.apply(6));        

    }
    
}
