/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author S542409
 */
public class Loan {
    private int loanAmount;
    
    @Override
    public String toString() {
        return "Loan amount is: " + loanAmount;
    }
    
    public Loan(int loanAmountIn) {
        this.loanAmount = loanAmountIn;
    }
}
