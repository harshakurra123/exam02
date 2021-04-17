/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S542409
 */
public class Question1 {

    
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        for (Integer value : list){
            if (!uniqueList.contains(value)) {
                uniqueList.add(value);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer unique: uniqueList) {
            System.out.print(unique+" ");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("answer for Question 1: Harshavardhan Kurra");
        // TODO code application logic here
        System.out.print("Enter ten integers: ");
        Scanner scan = new Scanner(System.in);
        int arrayLength = 10;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            arrayList.add(scan.nextInt());
        }
        removeDuplicate(arrayList);
        

    }
    
    
}
