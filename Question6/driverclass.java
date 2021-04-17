/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author S542409
 */
public class driverclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 6: Harshavardhan Kurra");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle");
        double firstSide = scan.nextDouble();
        double secondSide = scan.nextDouble();
        double thirdSide = scan.nextDouble();
        System.out.println("Enter color:");
        String color = scan.next();
        System.out.println("Is triangle filled(true/false):");
        boolean isTriangleFilled = scan.nextBoolean();
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide, color, isTriangleFilled);
        System.out.println(triangle);
    }
    
}
