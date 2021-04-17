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
public abstract class GeometricObject {
    private String color;
    private boolean isTriangleFilled;
    
    public GeometricObject(String color, boolean isTriangleFilled){
        this.color=color;
        this.isTriangleFilled=isTriangleFilled;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean getIsTriangleFilled(){
        return isTriangleFilled;
    }
    
    @Override
    public String toString() {
        return "color:" + color + "isTriangleFilled" + isTriangleFilled;
    }
    
    public abstract double Area();
    
    public abstract double Perimeter();
}
