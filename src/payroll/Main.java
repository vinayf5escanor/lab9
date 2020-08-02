/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author VINAY
 */
public class Main {
    public static void main (String[] args)
 {
   try
   {
     Payroll app = new Payroll();
     app.run();
   }
   catch (NumberFormatException e)
   {
     System.out.println("A number format is incorrect " + e.getMessage() + " Please ensure hours and wage are entered as numbers and not words");
   }
   catch(Exception e)
   {
     System.out.println("An exception was caught while trying to process employees: " + e.getMessage()); 
   }
  }//end main method
}
