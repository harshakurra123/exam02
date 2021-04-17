/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author S542409
 */
public enum Phones {
     NOKIA(1000),SAMSUNG(700),IPHONE(350);
   public int cost;
 
    private Phones(int cost) {
        this.cost = cost;
    }
 
    public int getCost() {
        return cost;
    }
}
