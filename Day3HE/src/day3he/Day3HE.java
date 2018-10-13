
package day3he;

import java.util.Scanner;

public class Day3HE {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        kalkulators();
    }
    
    public static void kalkulators(){
        
        double a = skaitluIevade(1);
        double b = skaitluIevade(2);
        
        System.out.println("Kadu darbibu veikt ar skaitliem?");
        System.out.println("+ - saskaitisanu, - - atnemsanu");
        System.out.println("cits vards - neveikt darbibu.");
        
        scanner.nextLine();
        String darbiba = scanner.nextLine();
        
        if (darbiba.equals("+")){
            System.out.println(a + " + " + b + " = " + saskaitisana(a, b));
        } else if(darbiba.equals("-")) {
            System.out.println(a + " - " + b + " = " + atnemsana(a, b));
        } else {
            System.out.println("Nekadas darbibas netiks veiktas!");
        }
    }
    
    public static double skaitluIevade(int i){
        System.out.println("Ludzu ievadiet " + i + ". skaitli!");        
        return scanner.nextDouble();
    }
    
    public static double saskaitisana(double sk1, double sk2){
        return sk1 + sk2;
    }
    
    public static double atnemsana(double  sk1, double sk2){
        return sk1 - sk2;
        
    }
    
}
