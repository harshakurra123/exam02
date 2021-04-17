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
public class Child extends Parent {
    public String str = "child class";
    
    public Child() {
    }
    
    @Override
    public String getStr() {
        return this.str;
    }
}
