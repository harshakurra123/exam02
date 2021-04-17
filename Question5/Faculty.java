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
public class Faculty extends Employee {
    private int officeHours;
    private int teachingSubjects;
    
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, int salary, String date, int officeHours, int teachingSubjects) {
        super(name, address, phoneNumber, emailAddress, office, salary, date);
        this.officeHours=officeHours;
        this.teachingSubjects=teachingSubjects;
    }
    
    public String toString() {
        return "Faculty class " + super.getName();
    }
}
