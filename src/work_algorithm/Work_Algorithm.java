/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work_algorithm;

import java.util.Scanner;

/**
 *
 * @author andrewcase
 */
public class Work_Algorithm {

final int weeks1 = 12;
final int weeks2 = 2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
      
        double total;
        
        String yes = "yes";
        String no = "no";
        String answer;
        
        System.out.println("Will you work at two stores: ");
        answer = scan.next();
        if (answer.equals(yes))
        {
            System.out.println("how much will you make at store 1: ");
            int pay1 = scan.nextInt();
            System.out.println("how much will you make at store 2: ");
            int pay2 = scan.nextInt();
            total = twoStores(pay1, pay2);
            System.out.println("your total after expenses is: " + total);
        }
        else
        {
            System.out.println("how much will you make: ");
            int pay = scan.nextInt();
            total = oneStore(pay);
            System.out.println("your total after expenses is: " + total);
        }
        
        
        
    }
    public static double twoStores(int pay1, int pay2)
    {
        int hours1, hours2;
        double total;
        Scanner scan = new Scanner (System.in);
        int loss_after_time = pay1 * 20 + pay2 * 20;
        double gas_price = 2.36 * 13 * 14;
        int expenses = 1400;
        System.out.println("how many hours per week will you work at store 1: ");
        hours1 = scan.nextInt();
        System.out.println("how many hours per week will you work at store 2: ");
        hours2 = scan.nextInt();
        total = (pay1 * 20 * 14) + (pay2 * 20 * 14);
        System.out.println("your total cash before expense is: " + total);
        total = total - expenses - gas_price - loss_after_time;
        return total;
    }
    public static double oneStore(int pay)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("how many hours per week will you work: ");
        double total;
        int hours;
        int expenses = 1400;
        hours = scan.nextInt();
        double gas_price = 2.36 * 13 * 7;
        int loss_after_time = pay * 2 * 20;
        total = (pay * 14 * hours);
        System.out.println("your total cash before expense is: " + total);
        total = total - loss_after_time - gas_price - expenses;
        return total;          
    }
    
}
