/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.defaultmethods;

import interfaces.InterestService;
import services.BrazilInterestService;
import services.UsaInterestService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class DefaultMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Amount: ");
        double amount = scan.nextDouble();
        System.out.print("Mounths: ");
        int mounths = scan.nextInt();
        
        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount,mounths);
        
        System.out.println("Payment after " + mounths + "mounths: ");
        System.out.println(String.format("%.2f", payment));
        
        scan.close();  
    }
}
