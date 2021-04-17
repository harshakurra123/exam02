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
public class StringMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for Question 5: Harshavardhan Kurra");
        Person person = new Person("harsha", "parkway apartments", "7338208199", "harshakurra@gmail.com");
        Student student = new Student("vardhan", "village o", "7546284687", "vardhan@gmail.com", "grade 10");
        Employee employee = new Employee("kurra", "horizons", "7845984576", "kurra@gmail.com", "colden pond", 10000, "04-10-2021");
        Faculty faculty = new Faculty("ratna", "srinagar", "9440374861", "ratna@gmail.com", "admin building", 20000, "08-10-2021", 20, 4);
        Staff staff = new Staff("siva", "arundelpet", "7482459382", "siva@gmail.com", "student union", 30000, "07-05-2021", "team");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
    
}
