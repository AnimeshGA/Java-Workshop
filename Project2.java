/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;
import java.util.Scanner;

/**
 *
 * @author Royal
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double minutesInYear = 60 * 24 * 365;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the number of minutes:");
        
        double min = input.nextDouble();
        
        long years = (long)(min / minutesInYear);
        
        int days = (int)(min/60/24) % 365;
        
        System.out.println((int)min + "minutes is approximately" + years + "years and" + days + " days") ;
        
    }
    
}
