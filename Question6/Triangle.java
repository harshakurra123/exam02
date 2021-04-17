/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author S542409
 */
public class Triangle extends GeometricObject {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    
    public Triangle(double firstSide, double secondSide, double thirdSide, String color, boolean isTriangleFilled) {
        super(color, isTriangleFilled);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    
    @Override
    public double Area(){
        double s = (firstSide+secondSide+thirdSide)/2;
        return Math.sqrt(s * (s-firstSide) * (s-secondSide) * (s-thirdSide));
    }
    
    @Override
    public double Perimeter(){
        return (firstSide+secondSide+thirdSide);
    }
    
    public String toString(){
        return "Triangle\n first side:" + firstSide + "\nsecond side:" + secondSide + "\nthird side:" + thirdSide + "\narea of triangle:" + Area() + "\nPerimeter of triangle:" + Perimeter();
    }
    
}
