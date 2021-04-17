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
public class Student extends Person {
    private String grade;
    private final String CLASS_STATUS = "GRADUATE";
    
    public Student(String name, String address, String phoneNumber, String emailAddress, String grade) {
        super(name, address, phoneNumber, emailAddress);
        this.grade=grade;
    }
    
    public String getGrade() {
        return grade;
    }
    
    @Override
    public String toString() {
        return "Student class " + super.getName();
    }
}
