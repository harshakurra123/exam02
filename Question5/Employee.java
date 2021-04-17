/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author S542409
 */
public class Employee extends Person {
    private String office;
    private int salary;
    private String date;
    
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, int salary, String date) {
        super(name, address, phoneNumber, emailAddress);
        this.office=office;
        this.salary=salary;
        this.date=date;
    }
            
            
    @Override
    public String toString() {
        return "Employee class " + super.getName();
    }
}
