/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author S542409
 */
public class Polymorphism {
	public static class Parent {
		static void method()
		{
			System.out.println("super class");
		}
	}
	public static class Child extends Parent {
		static void method()
		{
			System.out.println("sub class");
		}
	}

	public static void main(String[] args)
	{
                System.out.println("answer for Question 4: Harshavardhan Kurra");
		Parent A = new Parent();
		Parent B = new Child();
		A.method();
		B.method();
	}
}

