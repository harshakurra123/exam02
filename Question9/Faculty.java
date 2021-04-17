/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author S542409
 */
public class Faculty implements Person {
    public static final int SALARY = 1000;
    public static final String PHONENUMBER = "7338208199";
    
    public void getSalary() {
        System.out.println("Salary is" + SALARY);
    }
    
    public void getPhoneNumber() {
        System.out.println("Phone number is" + PHONENUMBER);
    }
}
