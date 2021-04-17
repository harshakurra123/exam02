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
public class Staff extends Employee {
    private String title;
    
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, int salary, String date, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, date);
        this.title=title;
    }
    
    @Override
    public String toString() {
        return "Staff class " + super.getName();
    }
}
