/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author ja_tu
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int a = 6 / 4;
//        a = 6 % 4;
//        double b = 6.0 / 4.0;
//        izvade();
//        int rez = saskaitit();
//        izvade2("Sis ir teksts");
//        uzdevums();
//        zarosanas();
        uzdevums2();
    }
    
    public static void izvade(){
        int c = saskaitit();
    }
    
    public static int saskaitit(){
        return 1+2;
    }
    
    public static void izvade2(String teksts){
        System.out.println(teksts);
    }
    
    public static void uzdevums(){
      
        String vards1 = vardaIevade();
        
        String vards2 = vardaIevade();
        
        String vards3 = vardaIevade();
        System.out.println("Vardu kombinacija ir: " + teksts(vards1, vards2, vards3));
    }
    
    public static String teksts(String v1, String v2, String v3){
        return v1 + " " + v2 + " " + v3;
    }
    
    public static String vardaIevade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet 1.vardu!");
        
        return scanner.nextLine();
    }
    
    public static double skaitlaIevade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        
        return scanner.nextDouble();
    }
    
    public static void zarosanas(){
        
        int a = 5;
        
        if(a >= 6){
            System.out.println("abc");
            System.out.println("abc2");
        } else {
            System.out.println("cba");
        }
        
        String b = "Coding";
        if (b.equals("Coding")){
            
        } else {
            
        }
    }
    
    public static void uzdevums2(){
        double skaitlis = skaitlaIevade();
        if(skaitlis <= 15.5){
            System.out.println("#");
        } else {
            System.out.println("##");
        }
    }
}
