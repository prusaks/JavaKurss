/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author ja_tu
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Alt+Shift+F - lai sakartotu rindas 
        // TODO code application logic here
//        saskaitisana(4, 5);
//        saskaitisana(9, 11);
//        int a = 5;
//        saskaitisana(a, 6);
        
        skaitluIevade();
//        System.out.println("Ievadiet 1.skaitli!");
//        Scanner sc = new Scanner(System.in);
//        int skaitlis1 = sc.nextInt();
//        
//        System.out.println("Ievadiet 2.skaitli!");
//        int skaitlis2= sc.nextInt();
//        int rezultats = skaitlis1 + skaitlis2;
//        System.out.println("Rezultats ir " + rezultats);
//        dzimsanasGadaAprekins();
        
    }
    
    public static void skaitluIevade(){
        
        System.out.println("Ludzu ievadiet 1.skaitli!");
        Scanner scanner = new Scanner(System.in);
        int skaitlis1 = scanner.nextInt();

        System.out.println("Ludzu ievadiet 2.skaitli!");
        int skaitlis2 = scanner.nextInt();

//        atnemsana(skaitlis1, skaitlis2);
        int citsRezultats = reizinasana(skaitlis1, skaitlis2);
        System.out.println(citsRezultats);
             
    }
    
    public static void saskaitisana(int skaitlis1, int skaitlis2){
        
        int rezultats = skaitlis1 + skaitlis2;
        System.out.println(rezultats);
        
    }
    
    public static void atnemsana(int skaitlis1, int skaitlis2){
        
        int rezultats = skaitlis1 - skaitlis2;
        System.out.println(rezultats);
        
    }
    
    public static int reizinasana(int skaitlis1, int skaitlis2){
        int rezultats = skaitlis1*skaitlis2;
        return rezultats;
    }

}
