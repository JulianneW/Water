/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waterandcomputermanufacturing;
import java.util.Scanner;
/**
 *
 * @author JuWoj8013
 */
public class WaterAndComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        double amnt1;
        double tons = 1.5;
        double sum = 0.0;
//        input
        System.out.println("Enter the number of computer monitors ");
        amnt1 = keyedInput.nextDouble();
//        equation
        sum = amnt1 * tons;
//        output
        System.out.println("Your "+ amnt1 +" computer monitors used "+ sum +" gallons of water");
        // TODO code application logic here
    }
    
}
