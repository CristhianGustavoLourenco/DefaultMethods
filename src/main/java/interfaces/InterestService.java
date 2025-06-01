/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.security.InvalidParameterException;

/**
 *
 * @author crist
 */
public interface InterestService {
    
    double getInterestRate();
    
    default double payment(double amount, int months) {
        if (months < 1) {

            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
  
}
