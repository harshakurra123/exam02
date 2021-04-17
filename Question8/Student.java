/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author S542409
 */
public class Student extends Person {
    public static final int SALARY = 3000;
    public static final String PHONENUMBER = "94409374861";
    
    public void getSalary() {
        System.out.println("Salary is" + SALARY);
    }
    
    public void getPhoneNumber() {
        System.out.println("Phone number is" + PHONENUMBER);
    }
}
