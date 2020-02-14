/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

import java.util.Scanner;

/**
 *
 * @author Saleh
 */
public class SalaryData {
        int salary;
        double perc;
        double hourlyRate;
        double total;
        double priceOfTime;
        Scanner sc = new Scanner(System.in);
    
        public void monthlyAfterTax(){ 
        calcHourlyWage();
        calcSalary();
        Taxes();
    }
       
        public void calcHourlyWage(){
        
        System.out.print("Enter your hourlyrate: ");
        salary = sc.nextInt();
    }
   
        public void calcSalary(){
            priceOfTime = salary*40*4;
            System.out.println("Your monthly salary with out taxes is "
                    +priceOfTime);
    }
        public void Taxes(){
        total = priceOfTime - perc*40*4;
       
        System.out.print("Enter the taxes: ");
        
        perc = sc.nextDouble();
        
        System.out.println("Your mnthly salary is "+ total);
    }
}
