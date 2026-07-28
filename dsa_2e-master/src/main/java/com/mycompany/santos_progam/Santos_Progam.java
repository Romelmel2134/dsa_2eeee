/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.santos_progam;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class Santos_Progam {
    
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        System.out.println("Hello World!");
        System.out.println("Flores,Romel L.");
        System.out.println("Enter A Number");
        int x = input.nextInt();
        System.out.println("Enter A Number");
        int y = input.nextInt();
        
        int sum,diff,prod,quo;
        sum = x + y;
        diff = x - y;
        prod = x * y;
        quo = x / y;
        System.out.println("sum is:" +sum);
        System.out.println("diff is:" +diff);
        System.out.println("prod is:" +prod);
        System.out.println("quo is:" +quo);
        
    }
}
