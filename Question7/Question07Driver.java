/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author S542409
 */
public class Question07Driver {
    public static void main(String[] args){
      System.out.println("answer for Question 7: Harshavardhan Kurra");
      Scanner scan =new Scanner(System.in); 
      System.out.println("Choose the phone needed: ");
      System.out.println("1.NOKIA");
      System.out.println("2.SAMSUNG");
      System.out.println("3.IPHONE");
      String name=scan.next().toUpperCase();
      while((!name.equals("NOKIA"))&&(!name.equals("SAMSUNG"))&&(!name.equals("IPHONE"))){
        System.out.println("Choose valid phone: ");
        System.out.println("1.NOKIA");
        System.out.println("2.SAMSUNG");
        System.out.println("3.IPHONE");
        name=scan.next().toUpperCase();
      }
      System.out.println("The price of " +name+"is" +Phones.valueOf(name).getCost());
    }
    
}
