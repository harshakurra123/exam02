/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S542409
 */
public class Question3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 3: Harshavardhan Kurra");
        Loan loan = new Loan(100000);
        Circle circle = new Circle(30);
        ArrayList<Object> arrayList = new ArrayList<>();
        Date date = new Date();
        String str = new String("my string");
        arrayList.add(loan);
        arrayList.add(circle);
        arrayList.add(date);
        arrayList.add(str);
        System.out.println(arrayList.toString());
        

    }
    
}
