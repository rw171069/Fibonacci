/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;
/**
 *
 * @author Reuben_2
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like the nth term to be? ");
        int nterm;
        nterm = input.nextInt()+1;
        int x = 5;
        double sqrtfiveaddone = 3.2360679775;
        double sqrtfiveminusone = 1.2360679775;
        System.out.print("1, ");
        System.out.print("1, ");
        for (int i = 3; i < nterm; i++) {
            //Numerator
            double sqrtfiveaddoneN = Math.pow(sqrtfiveaddone, i);
            //System.out.println("Add one"+sqrtfiveaddoneN);
            double sqrtfiveminusoneN = Math.pow(sqrtfiveminusone, i);
            //System.out.println("minus one"+sqrtfiveminusoneN);
            double numerator = sqrtfiveaddoneN - sqrtfiveminusoneN;
            //System.out.println("Numerator: "+numerator);
            //Denominator
            double twoN = Math.pow(2, i);
            //System.out.println("TwoN "+twoN);
            double sqrtfive = 2.2360679775;
            
            double denominator = twoN * sqrtfive;
            //System.out.println("Denominator "+ denominator);

            //Answer
            double answer = numerator / denominator;
            
            
            System.out.print(Math.round(answer)+", ");


            
            

        }

    }

}
