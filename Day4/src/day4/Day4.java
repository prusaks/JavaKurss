/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author ja_tu
 */
public class Day4 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        JaunaKlase piemers = new JaunaKlase();
//        piemers.izvade();
//        int a = piemers.atgriez();
//        System.out.println(a);
//        
//        JaunaKlase piemers2 = new JaunaKlase();
//        piemers2.izvade();
        
       ievade(); 
         
    }
    
    private static void ievade(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet 1. skaitli!");
        double a = scanner.nextDouble();
        
        System.out.println("Ievadiet 2. skaitli!");
        double b = scanner.nextDouble();
        
        System.out.println("Kadu darbibu veikt ar skaitliem?");
        System.out.println("+ - saskaitisanu, - - atnemsanu");
        System.out.println("cits vards - neveikt darbibu.");
        
        scanner.nextLine();
        String darbiba = scanner.nextLine();
        
        Kalkulators kalkulators = new Kalkulators();
        kalkulators.sasakaititVaiAtnemt(darbiba, a, b);

    }
    
}
