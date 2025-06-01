/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import interfaces.InterestService;
import java.security.InvalidParameterException;

/**
 *
 * @author crist
 */
public class BrazilInterestService implements InterestService{

    private double interestRate;

    public BrazilInterestService() {
    }

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
