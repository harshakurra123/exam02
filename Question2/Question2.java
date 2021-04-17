/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author S542409
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        System.out.println("answer for Question 2: Harshavardhan Kurra");
        System.out.print("Enter list1: ");
        Scanner scan = new Scanner(System.in);
        int[][] arrayList1 = new int[3][3];
        int[][] arrayList2 = new int[3][3];
        int arrayLength = 3;
        for (int i=0; i<arrayLength; i++) {
            for (int j=0; j<arrayLength; j++) {
                arrayList1[i][j] = scan.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int i=0; i<arrayLength; i++) {
            for (int j=0; j<arrayLength; j++) {
                arrayList2[i][j] = scan.nextInt();
            }
        }
        boolean result = equals(arrayList1, arrayList2);
        if(result){
            System.out.println("The two arrays are strictly identical");
        }
        else{
            System.out.println("The two arrays are not strictly identical");
        }
        
    }
    public static boolean equals(int[][] m1, int[][] m2){
        if (Arrays.deepEquals(m1, m2)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
}
